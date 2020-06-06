import java.util.Scanner;

public class UserManager {
	
	Scanner scan;
	
	public UserManager() {
		
		scan = new Scanner(System.in);		
	}	
	
	public boolean ExistenceUsersFile() {
		
		boolean exist = false;
		
		
		return exist;
	}	
	
	public void openFileUsers() {
		
		if(ExistenceUsersFile() == true) {
			
			
			
		}
		else {
			
			System.out.println("\n\tUser file does not exist.");		
			
		}		
		
	}
	
	
	public void userExistence() {
		
		
	}
	
}