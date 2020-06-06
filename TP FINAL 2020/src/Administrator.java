
public class Administrator extends User implements IAdminstrator {
	
	private String admin;	
	
	public Administrator() {
		
		super();
		seAdmin("");
		setPassword("");
	}
	
	public Administrator(String name, String surname, String adminname, String password) {
				
		//super(adminname, surname, username, password);		
		seAdmin(adminname);
		setPassword(password);		
	}	
	
	public String getAdmin() {return admin;	}
	public void seAdmin(String admin) {this.admin = admin;	}
	
	//public String getPasswoed() {return password;}
	//public void setPassword(String password) {this.password = password;}
	
	@Override
	public boolean equals( Object obj) {
		
		boolean exist = false;
		
		if(obj != null && obj instanceof Administrator) {
			
			Administrator admin = (Administrator) obj;
			
			if(getAdmin().equalsIgnoreCase(admin.getAdmin())){
				
				exist = true;				
			}			
		}		
		return exist;
	}
		
	//public String toString() {return super.toString()+ "\nAdmin Name: "+getAdmin()+"\nPassword: "+getPasswoed();}

	@Override
	public void enterNewUser() {
	
		
	}

	@Override
	public void ListUsers() {
		
		
	}



	@Override
	public void ListSales() {

		
	}

	@Override
	public void getTotalSales() {
	
		
	}

	@Override
	public void DeleteEmployee() {
		// TODO Auto-generated method stub
		
	}	
}