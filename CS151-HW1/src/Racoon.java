/**
 * 
 * @author Casual
 * @version 1.0
 * @since 2-21-22
 * 
 * Racoon class
 * <p>
 *This is the Racoon class which has the capabilities of a scratcher type
 * This Animal has predefined attributes and standard methods
 * </p>
 */
public class Racoon extends Animal implements Scratcher {
	/**
	 * private String attribute
	 */
	private String type = "Scratcher";
	/**
	 * private String attribute
	 */
	private String name = "Racoon";
	/**
	 * private String attribute
	 */
	private String gender = "male";
	/**
	 * private int attribute
	 */
	private int age = 12;
	/**
	 * private String attribute
	 */
	private String environment = "Forest";
	/**
	 * private String attribute
	 */
	private String speed = "15 mph";

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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
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

		System.out.println("snarl");

	}
	/**
	 * method for eating
	 */
	public void eat() {

		System.out.println("eating");

	}

}
