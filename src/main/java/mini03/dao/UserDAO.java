package mini03.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import mini03.model.User;
import mini03.model.UserAccount;
import mini03.Database;


public class UserDAO {
	public void addUserAccount(String firstName, String lastName, String email, String password) throws SQLException {
		try {
			PreparedStatement statement = Database.getConnection()
					.prepareStatement("insert into user(firstName,lastName) value(?,?)");
			statement.setString(1,firstName);
			statement.setString(2,lastName);
			statement.executeUpdate();
			
			
			int lastID = 0;
			Statement dbStatement = Database.getConnection().createStatement();
			ResultSet lastIDQuery = dbStatement.executeQuery("SELECT * FROM user"); 
			
			while (lastIDQuery.next()) {
				lastID = lastIDQuery.getInt("userID");
			}
			
			String sqlInsert = "insert into useraccount(email,password,userID) value(?,?,?)";
			statement = Database.getConnection().prepareStatement(sqlInsert);
			statement.setString(1,email);
			statement.setString(2,password);
			statement.setInt(3,lastID);
			
			statement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if (Database.getConnection() != null) {
				Database.getConnection().close();
			}
		}

	}
}
