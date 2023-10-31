package jspdemo;

public class UserValidate {
	public boolean isValidUser(String userName,String password) {
		if(userName.equals("tester")&&password.equals("tester"))
			return true;
		else
			return false;
	}
}
