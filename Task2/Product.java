package Task2;

public class Product {
	private String id;
	private String name;
	private double price;
	private String type;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getId() {
		return id;
	}

	public String getType() {
		return type;
	}

	public Product(String id, String name, double price, String type) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.type = type;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String toString() {
		return "Product{" + "id='" + id + '\'' + ", name='" + name + '\'' + ", price=" + price + ", type='" + type
				+ '\'' + '}';
	}
}
