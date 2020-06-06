
public class Producto {	
	
	/*
	public abstract class Product {
		private int idProduct;
		private String name;
		private Date vencimiento;
		private int stock;
		private int lote;
		
		public Product() {};
		public Product(int id, String name, int stock, int lote)
		{
			this.idProduct = id;
			this.name = name;
			this.vencimiento = new Date();
			this.lote = lote;
			this.stock = stock;
		}
		
		public String getName() {
			return name;
		}
		public int getStock() {
			return stock;
		}
		public int getIdProduct() {
			return idProduct;
		}
		
		@Override
		public String toString ()
		{
			return "ID: "+idProduct+" "+"Desc: "+" "+name+" "+"Vencimiento: "+ " "+ vencimiento.toString();
		}
		

		

	}*/
	
	
	/// *****************************************************************************************************************
		
	private int warehouseStock;
	private int totalStock;
	private int localSock;
	
	private String marca;	
	private String category;
	private double price;
	private int codigo;
	private int stock;
	private boolean enabled;
		
	public Producto(String marca, int codigo, int stock, double price, String category) {
		
		setCodigo(codigo);
		setMarca(marca);
		setStock(stock);
		setPrice(price);
		setCategory(category);
	}
	
	public Producto() {
		
		setCodigo(0);
		setMarca("");
		setStock(0);
		setPrice(0.0);
		setCategory("");
	}
		
	public int getCodigo() {return codigo;}
	public void setCodigo(int codigo) {this.codigo = codigo;}
	
	public String getMarca() {return marca;}
	public void setMarca(String marca) {this.marca = marca;}
	
	public int getStock() {return stock;}
	public void setStock(int stock) {this.stock = stock;}	
	
	
	public double getPrice() {return price;}
	public void  setPrice(double price){this.price = price;}

	public String getCategory() {return category;}
	public void setCategory(String category) {this.category = category;}
	
	public boolean isEnabled() {return enabled;}
	public void setEnabled(boolean enabled) {this.enabled = enabled;}	
	
	public int getWarehouseStock() {return warehouseStock;}
	public void setWarehouseStock(int warehouseStock) {	this.warehouseStock = warehouseStock;}

	public int getTotalStock() {return totalStock;}
	public void setTotalStock(int totalStock) {this.totalStock = totalStock;}

	public int getLocalSock() {return localSock;}
	public void setLocalSock(int localSock) {this.localSock = localSock;}	
		
	@Override
	public boolean equals(Object obj) {

		boolean iguales = false;
		
		if(obj != null && obj instanceof Producto) {
			
			Producto producto = (Producto) obj;
				
			if(getCodigo() == producto.getCodigo()){
				
				iguales = true;
			}			
		}	
		return iguales;
	}
	
	@Override
	public String toString() {return "\nMarca: "+getMarca() + "\nCodigo: "+getCodigo()+ "\nStock: "+getStock() ;}
	
}