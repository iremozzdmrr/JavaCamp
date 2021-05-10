package day3;

public class UserManager {
	
	public void LogIn(User user) {
		System.out.println(user.getFirstName()+ " "+user.getLastName()+" sisteme giri� yapt�");
	}
	
	public void LogInMultiple(User[] users) {
		for(User user : users) {
			LogIn(user);
			
		}
	}

}
