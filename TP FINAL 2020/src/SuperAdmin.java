
public class SuperAdmin {
	
	private String name;
	private String password;	
	
	public SuperAdmin() {
		
		setName("admin");
		setPassword("admin1");		
	}

	public String getName() {return name;}
	public void setName(String name) {this.name = name;}

	public String getPassword() {return password;}
	public void setPassword(String password) {this.password = password;}
	
	
	boolean checkName(String checkname) {
		
		boolean right = false;
		
		if(getName().equalsIgnoreCase(checkname)) {
			
			right = true;
		}			
		return right;
	}
	
	
	boolean checkPassword(String checkpass) {
		
		boolean right = false;
		
		if(getPassword().equalsIgnoreCase(checkpass))			
			right = true;
				
		return right;
	}	
	
	
	boolean totalAccess(String checkname, String checkpass) {
		
		boolean access = false;
		
		if(checkName(checkname) == true && checkPassword(checkpass) == true)
			access = true;		
		
		return access;
	}	
	
	
	@Override
	public String toString() {return "\nName: "+getName()+"\nPassword: "+getPassword();}
}