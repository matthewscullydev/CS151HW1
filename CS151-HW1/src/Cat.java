
public class Cat extends Animal implements Scratcher, Domesticated {

	private String type = "Scratcher and Domesticated";
	private String name = "Cat";
	private int age = 8;
	private String gender = "female";
	private String environment = "Home";
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

		System.out.println("meow");

	}

	public void eat() {

		System.out.println("eating");

	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}
