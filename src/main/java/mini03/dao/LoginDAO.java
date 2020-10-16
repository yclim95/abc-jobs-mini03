package mini03.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import mini03.Database;

public class LoginDAO {
	
	public ResultSet validateLoginCreditial(String email, String password) {
		Connection con = Database.getConnection();
		ResultSet numOfRecord = null;
		try {
			PreparedStatement statement = con.prepareStatement("SELECT * from userAccount where email =? AND password =?");
			statement.setString(1,email);
			statement.setString(2,password);
			numOfRecord = statement.executeQuery();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return numOfRecord;
	} 
}
