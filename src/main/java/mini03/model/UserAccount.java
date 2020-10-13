package mini03.model;

public class UserAccount {
	private String email;
	private String password;
	
	public UserAccount() {
		
	}
	
	UserAccount(String email, String pasword){
		this.setEmail(email);
		this.setPassword(pasword);
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
