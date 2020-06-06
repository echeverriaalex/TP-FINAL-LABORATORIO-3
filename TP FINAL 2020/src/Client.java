
public class Client  extends Person{	
	
	private String phone;		
	
	public Client(String name, String surname, String phone) {
		
		super(name, surname);
		setPhone(phone);		
	}	
	
	public Client() {
		
		super();
		setPhone("");		
	}
	
	
	public String getPhone() {return phone;}
	public void setPhone(String phone) {this.phone = phone;}
	
	
	
	
	
	
	public void FuncionCliente() {
		
		
		//boolean admin = Menu();
		
		//if(admin == true){
			
			System.out.println("eres admin");
			//administratorMenu();
		//}			
		//else {
			
			System.out.println("no sirves");
		//}
		
		
		
		
	}	
	
	@Override
	public boolean equals(Object obj) {
		
		boolean iguales = false;
		
		if(obj != null && obj instanceof Client) {
		
			Client newcliente = (Client) obj;			
			
			if(getPhone().equalsIgnoreCase(newcliente.getPhone()))
				iguales = true;			
		}		
		return iguales;
	}
	
	
	@Override
	public String toString() {return super.toString();}
}