package entities;

public class Product implements Comparable<Product> {
	// Atributo
	private String name;
	private Double price;
	
	// Método Getter e Setter
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setPrice(Double price) {
		this.price = price;
	}
	
	public Double getPrice() {
		return price;
	}
	
	// Método Construtor
	public Product() {
		
	}
	
	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	// Método
	@Override
	public int compareTo(Product p) {
		return name.toUpperCase().compareTo(p.getName().toUpperCase());
	}
	
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}
}
