package mini03.action;

import com.opensymphony.xwork2.ActionSupport;

import mini03.dao.UserDAO;
import mini03.model.User;
import mini03.model.UserAccount;

public class RegisterAction extends ActionSupport {
	
	private User user;
	private UserAccount userAccount;	
	
	
	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}



	public UserAccount getUserAccount() {
		return userAccount;
	}


	public void setUserAccount(UserAccount userAccount) {
		this.userAccount = userAccount;
	}


	@Override
	public String execute() throws Exception {
		System.out.println("Register Action");
		//user = new User();
		//userAccount = new UserAccount();
		UserDAO userDao=new UserDAO();
		userDao.addUserAccount(user.getFirstName(), user.getLastName(),
				userAccount.getEmail(), userAccount.getPassword());
		return "success";
	}
	
}
