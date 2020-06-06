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
		String contraseña = " ";		
		
		if(VerificarNombre(nombre)){
			
			System.out.println("\nEnter password: ");
			contraseña = scan.next();			
			
			VerificarContraseña(contraseña); 			
			
			while(VerificarContraseña(contraseña) == false) {
				
				System.out.println("Password is incorrect. Retry.");
				
				System.out.println("\nEnter password: ");
				contraseña = scan.next();				
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
	
	public boolean VerificarContraseña(String contraseña) {
		
		boolean admin = false;		
		//if(Administrator.getContraseña().equalsIgnoreCase(contraseña))			
			admin = true;		
		return admin;
	}		
}