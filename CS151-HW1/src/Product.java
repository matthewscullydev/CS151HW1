/**
 * 
 * @author Matthew Scully
 * @version 1.0
 * @since 2-21-22
 * 
 * Product class
 * <p>
 * This is an immutable class with various attributes.
 * It only contains getters and an overriden toString() method.
 * </p>
 */
public class Product {
	/**
	 * private String attribute
	 */
	private String name;
	/**
	 * private String attribute
	 */
	private String description;
	/**
	 * private int attribute
	 */
	private int price;
	/**
	 * private int attribute
	 */
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
	/**
	 * Overridden toString method, this method prints out all attributes of the object
	 * @return string with attributes of object listed.
	 */
	@Override
	public String toString() {

		String modified = "Modifed string, name = " + name + " description = " + description + " price = " + price
				+ " max quantity = " + maxQuantity;
		System.out.println(modified);
		return modified;
	}

}
