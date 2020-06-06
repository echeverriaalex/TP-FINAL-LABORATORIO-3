import java.util.HashMap;
import java.util.Scanner;

public class ProductManagement{
	
	public Scanner scan = new Scanner(System.in);
	private HashMap<Integer, String> hashmapProductos;
		
		
	public ProductManagement(){hashmapProductos = new HashMap<Integer, String>();}		
		
	public void deleteProduct(Integer clave) {hashmapProductos.remove(clave);}
		
	public String listEnabledContent() {
			
		StringBuilder builder = new StringBuilder();
			
		for(Integer data : hashmapProductos.keySet()) {
						
			//if(hashmapProductos.)
				builder.append(data.toString()+"\n\n");
		}		
		return builder.toString();
	}	
	
	public String listDisabledContent() {
		
		StringBuilder builder = new StringBuilder();
			
		for(Integer data : hashmapProductos.keySet()) {
						
			//if(hashmapProductos.)
				builder.append(data.toString()+"\n\n");
		}		
		return builder.toString();
	}
	
	
	public String listAllContent() {
		
		StringBuilder builder = new StringBuilder();
			
		for(Integer leido : hashmapProductos.keySet()) {
				
			builder.append(leido.toString()+"\n\n");			
		}		
		return builder.toString();
	}
	
	public String verifyContent() {
		
		String message = " ";
		
		if(hashmapProductos.isEmpty() == true)
			message = "\n\n\tThere is no content to display.";			
		else
			message = listAllContent();
		return message;
	}
	
		
	public void agregarProducto(Integer codigo, String informacion) {hashmapProductos.put(codigo, informacion);}
	
	public void agregarProducto() {
		
		char control = 'y';
		
		while(control == 'y') {
			
			Producto nuevo = new Producto();
		
			System.out.println("Enter the product brand: ");
			nuevo.setMarca(scan.next());
			
			System.out.println("Enter the product code: ");		
			nuevo.setCodigo(scan.nextInt());		
			
			System.out.println("Enter the product stock: ");
			nuevo.setStock(scan.nextInt());		
			
			agregarProducto(nuevo.getCodigo(), nuevo.toString());
		
			System.out.println("\n\tSuccessfully added product");
						
			System.out.println("Add a new product?  Yes or No");	
			control = scan.next().charAt(0);			
		}	
	}
	
	
	public void eliminarProductos() {
		
		char control = 'y';
		
		while(control == 'y') {
		
			System.out.println("Enter the product code to remove: ");		
			deleteProduct(scan.nextInt());
			System.out.println("\n\n\tOperation performed successfully");	
			
			System.out.println("Remove other product?  Yes or No");	
			control = scan.next().charAt(0);			
		}		
	}
	
	public int printManagementMenu() {
		
		System.out.println("\n\t\t Products menu \n\n");
		System.out.println("1- Add a new product");
		System.out.println("2- List all products");
		System.out.println("3- List the enabled products");
		System.out.println("4- List the disabled products");
		System.out.println("5- List products of a category");		
		System.out.println("6- Remove a product");
		System.out.println("0- Leave this menu.");
		System.out.println("\n\nExecute the operation: ");	
		return scan.nextInt();
	}
	
	public void ManagementMenu() throws InterruptedException {
		
		int opcion = 99;
		
		while(opcion != 0) {
			
			opcion = printManagementMenu();
			
			switch(opcion) {
			
				case 1: agregarProducto(); break;
				
				case 2: System.out.println(verifyContent());break;
				
				case 3: eliminarProductos();break;
								
				// CON ESTE CASO PENSAR BIEN CON EL TRY Y CATCH COMO HACERLO INRROMPIBLE Y AUTOSOLUCIONABLE
				case 0: System.out.println("\nLeaving the menu ...");						
						Thread.sleep(2000);
						System.out.println("\nExit");
						break;			
				
				default: System.out.println("\nAttention: the option entered is not valid. Try again.");break;			
			}			
		}	
	}
}