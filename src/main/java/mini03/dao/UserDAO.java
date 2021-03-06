package mini03.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import mini03.model.User;
import mini03.model.UserAccount;
import mini03.Database;


public class UserDAO {
	public void addUserAccount(String firstName, String lastName, String email, String password) throws SQLException {
		Connection con = Database.getConnection();
		try {
			PreparedStatement statement = con.prepareStatement("insert into user(firstName,lastName) value(?,?)");
			statement.setString(1,firstName);
			statement.setString(2,lastName);
			statement.executeUpdate();
			
			
			int lastID = 0;
			Statement dbStatement = con.createStatement();
			ResultSet lastIDQuery = dbStatement.executeQuery("SELECT * FROM user"); 
			
			while (lastIDQuery.next()) {
				lastID = lastIDQuery.getInt("userID");
			}
			
			String sqlInsert = "insert into useraccount(email,password,userID) value(?,?,?)";
			statement = con.prepareStatement(sqlInsert);
			statement.setString(1,email);
			statement.setString(2,password);
			statement.setInt(3,lastID);
			
			statement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}
	
	public String getFirstName(String email) throws SQLException {
			Connection con = Database.getConnection();
			ResultSet lastIDQuery = null;
			String firstName = "";
		try {
			PreparedStatement statement = con.prepareStatement("SELECT firstName from userAccount where email =?");
			statement.setString(1,email);
			lastIDQuery = statement.executeQuery();
			
			if (lastIDQuery.next()) {
				firstName = lastIDQuery.getString("firstName");
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return firstName;
	}
	
	public int updateUserProfile(String firstName, String lastName, String email, String password,
			String currentJob, String contactNo, String biography) throws SQLException {
			Connection con = Database.getConnection();
			ResultSet lastIDQuery = null;
			int result = 0;
		try {
			PreparedStatement statement = con.prepareStatement("SELECT userID from userAccount where email =?");
			statement.setString(1,email);
			lastIDQuery = statement.executeQuery();
			
			int userID = 0;
			if (lastIDQuery.next()) {
				userID = lastIDQuery.getInt("userID");
			}
			
			String sqlInsert = "UPDATE user set firstName=?, lastName=?, currentJob=?, contactNo=?, biography=? WHERE userID=?";
			statement = con.prepareStatement(sqlInsert);
			statement.setString(1,firstName);
			statement.setString(2,lastName);
			statement.setString(3,currentJob);
			statement.setString(4,contactNo);
			statement.setString(5,biography);
			statement.setInt(6,userID);
			
			result = statement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
}
