import java.util.Scanner;

public class ProcessData {
	
	private Scanner scan;
	
	public ProcessData() {scan = new Scanner(System.in);}
	
	public String askUser() {
		
		System.out.println("\nUser name: ");		
		return scan.next();	
	}
	
	public String askPassword() {
		
		System.out.println("\nPassword: ");		
		return scan.next();
	}	
}