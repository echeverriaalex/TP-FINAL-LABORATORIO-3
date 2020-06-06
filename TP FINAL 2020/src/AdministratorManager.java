import java.util.Scanner;

public class AdministratorManager {	
	
	public Scanner scan;	
	
	public AdministratorManager() {scan = new Scanner(System.in);}
	
	public boolean Menu() {
		
		System.out.println("\n\t Welcome to Manager Stock");
		System.out.println("\n\t\t Start Menu\n");		
		System.out.println("\nTo exit enter 'exit'.");
		System.out.println("\nEnter your name: ");		
		return 	VerificarAdmin(scan.next());
	}	
	
	public int administratorMenu() {
		
		System.out.println("1- Enter a new product");
		System.out.println("2- Modify a product");
		System.out.println("3- Delete a product");		
		System.out.println("4- ");
		System.out.println("5- ");
		System.out.println("0- Get out of the system");
		System.out.println("Ejecutar la operacion:  ");		
		return scan.nextInt();
	}	
	
	public boolean VerificarAdmin(String nombre) {
		
		boolean admin = false;
		String contrase�a = " ";		
		
		if(VerificarNombre(nombre)){
			
			System.out.println("\nEnter password: ");
			contrase�a = scan.next();			
			
			VerificarContrase�a(contrase�a); 			
			
			while(VerificarContrase�a(contrase�a) == false) {
				
				System.out.println("Password is incorrect. Retry.");
				
				System.out.println("\nEnter password: ");
				contrase�a = scan.next();				
			}			
			admin = true;
		}
	
		return admin;
	}

	public boolean VerificarNombre(String nombre) {
		
		boolean admin = false;		
		//if(Administrator.getNombreAdmin().equalsIgnoreCase(nombre))			
			admin = true;		
		return admin;
	}
	
	public boolean VerificarContrase�a(String contrase�a) {
		
		boolean admin = false;		
		//if(Administrator.getContrase�a().equalsIgnoreCase(contrase�a))			
			admin = true;		
		return admin;
	}		
}