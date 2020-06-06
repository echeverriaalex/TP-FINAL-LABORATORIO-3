
public class RestrictAccess {
	
	public  RestrictAccess() {}
	
	
	public boolean isAdministrator(Object obj) {
		
		boolean admin = false;
		
		if( obj != null && obj instanceof Administrator) {
			
			admin = true;			
		}		
		return admin;
	}
	
	
	

}