
public class Product {

	private String name;
	private String description;
	private int price;
	private int maxQuantity;

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public int getPrice() {
		return price;
	}

	public int getMaxQuantity() {
		return maxQuantity;
	}

	public Product(String name, String description, int price, int maxQuantity) {
		this.name = name;
		this.description = description;
		this.price = price;
		this.maxQuantity = maxQuantity;

	}

	@Override
	public String toString() {

		String modified = "Modifed string, name = " + name + " description = " + description + " price = " + price
				+ " max quantity = " + maxQuantity;
		System.out.println(modified);
		return modified;
	}

}
