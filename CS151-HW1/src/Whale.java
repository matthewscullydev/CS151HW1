/**
 * 
 * @author Matthew Scully
 * @version 1.0
 * @since 2-21-22
 * 
 * Whale class
 * <p>
 * This is the Whale class which has the capabilities of a swimmer type
 * This Animal has predefined attributes and standard methods
 * </p>
 */
public class Whale extends Animal implements Swimmer {

	private String type = "Swimmer";
	private String name = "Whale";
	private int age = 123;
	private String gender = "female";
	private String environment = "Ocean";
	private String speed = "32 mph";

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

	public void move() {

		System.out.println("moving");

	}

	public void sleep() {

		System.out.println("sleeping");

	}

	public void sound() {

		System.out.println("woooooosh");

	}

	public void eat() {

		System.out.println("eating");

	}

}
