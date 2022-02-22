/**
 * 
 * @author Casual
 * @version 1.0
 * @since 2-21-22
 * 
 * Dog class
 * <p>
 *This is the dog class which has the capabilities of a domesticated type
 * This Animal has predefined attributes and standard methods including the bark method
 * </p>
 */
public class Dog extends Animal implements Domesticated {
	/**
	 * private String attribute
	 */
	private String type = "Domesticated";
	/**
	 * private String attribute
	 */
	private String name = "dog";	
	/**
	 * private int attribute
	 */
	private int age = 7;
	/**
	 * private String attribute
	 */
	private String gender = "male";
	/**
	 * private String attribute
	 */
	private String environment = "home";
	/**
	 * private String attribute
	 */
	private String speed = "30 mph";

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEnvironment() {
		return environment;
	}

	public void setEnvironment(String environment) {
		this.environment = environment;
	}

	public String getSpeed() {
		return speed;
	}

	public void setSpeed(String speed) {
		this.speed = speed;
	}
	
	/**
	 * Overridden toString method, this method could print out all attributes
	 * but in this case the program specified to print out what it is doing
	 * @return string of author's choice
	 */
	@Override
	public String toString() {

		String teststr = "replaced string";
		System.out.println("toString");
		return teststr;
	}
	
	/**
	 * method for moving
	 */
	public void move() {
		
		System.out.println("moving");

	}
	
	/**
	 * method for sleeping
	 */

	public void sleep() {

		System.out.println("sleeping");

	}
	
	/**
	 * method for animal sound
	 */
	public void sound() {

		System.out.println("woof");

	}

	/**
	 * method for eating
	 */
	public void eat() {

		System.out.println("eating");

	}
	/**
	 * method for barking
	 */
	public void bark() {
		System.out.println("bark");
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
}
