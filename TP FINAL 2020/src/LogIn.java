import java.util.Scanner;

public class LogIn {	
	
	Scanner scan;	
	
	public LogIn() {
		
		scan = new Scanner(System.in);	
	}
	
	
	public void printLoginMenu() {		
		
		
		
	}
	
	
	public void runLgIn() {
		
		int work = 99;
		
		while(work != 0) {
			
			switch (work) {
			
				case 1:
					break;
					
				case 2:
					break;
					
				case 3:
					break;
					
				case 4:
					break;
			
				case 0: System.out.println("\n\nThe session has been successfully completed.");
					break;
	
				default:System.out.println("\n\nThe operation entered at the login is not correct, try again.");
					break;
			}
			
			
			
			
		}	
		
	}
}