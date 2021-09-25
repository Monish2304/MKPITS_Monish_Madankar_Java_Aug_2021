class User {

	private String userName;

	private String password;

	public String getUserName() {

		return userName;
	}

	public void setUserName(String userName) {

		this.userName=userName;
	}

	public String getPassword() {

		return password;
	}

	public void setPassword(String password) {

		this.password=password;
	}

	public String checkLogin(String userName,String password) {

		if(userName.equals("admin") && password.equals("admin")) {

			return "Login Successful for user" + userName;
		}

		else {

			return "Invalid credentials, try again";
		}
	}
}

public class Encapsulation5 {

	public static void main(String []args) {

		User u1=new User();

		java.util.Scanner s=new java.util.Scanner(System.in);

		System.out.println("Enter Username");

		String un = s.next();

		System.out.println("Enter Password");

		String pwd = s.next();

		u1.setUserName(un);

		u1.setPassword(pwd);
		String result = u1.checkLogin(u1.getUserName(),u1.getPassword());

		System.out.println(result);
	}
}