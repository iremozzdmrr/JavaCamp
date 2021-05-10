package day3;

public class UserManager {
	
	public void LogIn(User user) {
		System.out.println(user.getFirstName()+ " "+user.getLastName()+" sisteme giriş yaptı");
	}
	
	public void LogInMultiple(User[] users) {
		for(User user : users) {
			LogIn(user);
			
		}
	}

}
