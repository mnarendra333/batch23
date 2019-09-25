package pack1;

public class Login {
	
	public void validate(String username, String password) throws 
	InvalidLoginException
	{
		
		if(username.equals("pragim") && password.equals("pragim"))
			System.out.println("login success");
		else
			throw new InvalidLoginException("username or pwd is invalid!!Plz try again");
		
	}
	
	public static void main(String[] args) {
		Login obj = new Login();
		try {
			obj.validate("pragim", "test");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
