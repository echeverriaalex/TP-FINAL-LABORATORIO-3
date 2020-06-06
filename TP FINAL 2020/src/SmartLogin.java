
public class SmartLogin {	
	
	private ProcessData proccessData;
	
	public SmartLogin() {proccessData = new ProcessData();}	
			
	
	public int isSuperAdmin(String name, String password) {
		
		SuperAdmin superadmin = new SuperAdmin();		
		boolean accessIs = superadmin.totalAccess(proccessData.askUser(), proccessData.askPassword());
		
		int value = 99;
		
		if(accessIs == true) {
			
			value = -1;	
		}
		
		return value;
	}
	
	
	public int isAdmin() {
		
		
		return 0;
	}
	
	
	public int isEmployee() {
		
		
		return 1;
	}
	

}