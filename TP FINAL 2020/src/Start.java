
public class Start {
	
	private ProcessData processData;
	private SuperAdmin superAdmin;	
	
	public Start(){
		
		processData = new ProcessData();
		superAdmin = new SuperAdmin();	
	}		
	
	public void runProgram() {				
		
		String username = processData.askUser();
		String password = processData.askPassword();
		
		boolean sessionStarted = false;		
		
		while(sessionStarted == false) {
			
			if(username.contentEquals(superAdmin.getName()) == true) {
			
				if(password.contentEquals(superAdmin.getPassword()) == true) {
					
					System.out.println("hola super admin");
					SuperAdminManagement sam = new SuperAdminManagement();
					
					sessionStarted = sam.runManagement();			
				}					
			}		
			else {			
				
				int work = 99;			
				while(work != 0) {					
							
					switch(work) {
					
						case 1: break;
						
						case 2: break;
						
						case 3: break;
						
						case 4: break;
						
						case 5: break;
						
						case 6: break;
						
						case 0: Exit exit = new Exit();
								exit.closeProgram();				
								break;
						
						default: System.out.println("\n\nThe entered operation is not correct, please retry."); break;
					}	
				}			
			}
			
			
			
		}
		
	
					
	}
}