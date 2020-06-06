import java.util.Scanner;
import java.util.HashMap;

public class SuperAdminManagement {
	
	private Scanner scan;
	private HashMap<String , String> hashmapPersons;
	
	public SuperAdminManagement() {
		scan = new Scanner(System.in);
		hashmapPersons = new HashMap<>();
	}		
	
	public String  listPersons() {
		
		StringBuilder builder = new StringBuilder();
		
		for(String date: hashmapPersons.keySet()) {
			
			builder.append(date.toString());			
		}		
		return builder.toString();
	}
	
	/*
	public void addPerson(Person newperson) {
		
		//hashmapPersons.put(newperson.getPhone(), newperson.toString());		
	}	*/
	
	
	public boolean Exist(String info) {
		
		boolean exist = false;
		
		for(String date: hashmapPersons.keySet()) {
			
			if(date.toString().equalsIgnoreCase(info))
				exist = true;			
		}		
		return exist;
	}
	
	
	public String Search(String info) {
		
		StringBuilder builder = new StringBuilder();
		
		for(String date: hashmapPersons.keySet()) {
			
			if(date.toString().equalsIgnoreCase(info))
			
			builder.append(date.toString()+"\n");			
		}		
		return "\nSearch results: \n"+builder.toString();		
	}
	
	
	/*
	public boolean removePerson(Person removeperson) {
		
		boolean success = false;
		//success = hashmapPersons.remove(removeperson.getPhone(), removeperson.toString());		
		return success;
	}*/
	
	
	
	public int printSuperAdminMenu() {
		
		SuperAdmin superadmin = new SuperAdmin();	
		
		System.out.println("Welcome super admin");		
		System.out.println(superadmin.toString());	
		
		
		System.out.println("\n\n\t\t Welcome to Stoker \n\n");
		System.out.println("1- Enter the admistrators menu.");
		System.out.println("2- Enter the providers menu.");
		System.out.println("3- Enter the customers menu.");
		System.out.println("4- Enter the employee menu.");
		System.out.println("0- Sign off.");
		return scan.nextInt();
	}
	
	
	public boolean runManagement() {
		
		boolean out = false;
		
		int work = 99;
		work = printSuperAdminMenu();
		
		while(work != 0 && out == false ) {			
			
			//SmartLogin smart = new SmartLogin();
			//smart.requestData();
						
			switch(work) {
			
				case 1: 
						break;
				
				case 2: 
						break;
				
				case 3:
						break;
				
				case 4:
						break;
				
				case 5:
						break;
				
				case 6: 
						break;
				
				case 0: Exit exit = new Exit();
						exit.closeProgram();	
						out = true;
						break;
				
				default: System.out.println("\n\nThe entered operation is not correct, please retry."); break;
			}	
		}
		
		return out;
		
		
	}
}