
public class Provider{
	
	private String company;
	private String contact;		
	
	public Provider() {
		
		super();
		setCompany("");
		setContact("");		
	}
	
	public Provider(String nombre, String apellido, String company, String contacto) {
		
		
		setCompany(company); 
		setContact(contacto);
	}

	public String getCompany() {return company;}
	public void setCompany(String company) {this.company = company;	}	

	public String getContact() {return contact;}
	public void setContact(String contact) {this.contact = contact;}
	
	public String toString() {return super.toString() + "\nCompany: "+getCompany()+"\nContact: "+getContact();}
}