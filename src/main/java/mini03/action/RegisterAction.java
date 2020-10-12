package mini03.action;

import com.opensymphony.xwork2.ActionSupport;

import mini03.dao.UserDAO;
import mini03.model.User;
import mini03.model.UserAccount;

public class RegisterAction extends ActionSupport {
	
	private User user;
	private UserAccount userAccount;
	
	
	@Override
	public String execute() throws Exception {
		//UserDAO userDao=new UserDAO();
		//userDao.addUserAccount(user.getFirstName(), user.getLastName(),
			//	userAccount.getEmail(), userAccount.getPassword());
		return "success";
	}
	
}
