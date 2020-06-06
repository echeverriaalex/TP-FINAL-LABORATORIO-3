import org.json.JSONException;
import org.json.JSONObject;

public class User{
	
	private String username;
	private String surname;		
	private String password;
	private String name;
		
	public User(String name, String surname, String username, String password) {
		
		setName(name);
		setSurname(surname);
		setUsername(username);
		setPassword(password);
	}
	
	public User() {
		
		setName("");
		setSurname("");
		setUsername("");
		setPassword("");
	}	
	
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	
	public String getSurname() {return surname;}
	public void setSurname(String surname) {this.surname = surname;}
	
	public String getUsername() {return username;}
	public void setUsername(String username) {this.username = username;}
	
	public void setPassword(String password) {this.password = password;}
	public String getPassword() {return password;}	
		
	@Override
	public boolean equals(Object obj) {
		
		boolean exist = false;
		
		if(obj != null && obj instanceof User) {
			
			User user = (User) obj;
			
			if(getUsername().equalsIgnoreCase(user.getUsername()))
				exist = true;			
		}		
		return exist;
	}	
	
	public JSONObject getJsonUser() throws JSONException{
	
		JSONObject user = new JSONObject();		
		user.put("Name", getName());
		user.put("Surname", getSurname());		
		user.put("UserName", getUsername());
		user.put("Password", getPassword());		
		return user;
	}
	
	

	@Override
	public String toString() {return "\nName: "+getName()+"\nSurname: "+getSurname()+"\nUsername: "+getUsername()+"\nPassword: "+getPassword();}	
}