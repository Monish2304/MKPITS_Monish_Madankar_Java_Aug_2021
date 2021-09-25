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

	public String checkLogin(String un,String pwd) {

		if(userName.equals(un) && password.equals(pwd)) {

			return "login successful for user" +userName;
		}

		else {

			return "Invalid credentials, try again";
		}
	}

		public String signup(String userName,String password) {

			setUserName(userName);

			setPassword(password);

			return "User details saved successfully";
		}

		public void dislay() {

	}
}

class Encapsulation6 {

	public static void main(String []args) {

		User u1=new User();

		java.util.Scanner s=new java.util.Scanner(System.in);

		System.out.println("Process to create account(signup)");

		System.out.println("Enter username: ");

		String un = s.next();

		System.out.println("Enter password: ");

		String pwd = s.next();

		String result = u1.signup(un,pwd);

		System.out.println(result);

		System.out.println("---------------------------------");

		System.out.println("Process to signin (login)");

		System.out.println("Enter username: ");

		un = s.next();

		System.out.println("Enter password: ");

		pwd = s.next();

		result = u1.checkLogin(un,pwd);

		System.out.println(result);
	}
}