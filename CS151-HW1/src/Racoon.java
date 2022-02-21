
public class Racoon extends Animal implements Scratcher {

	private String type = "Scratcher";
	private String name = "Racoon";
	private String gender = "male";
	private int age = 12;
	private String environment = "Forest";
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

		System.out.println("snarl");

	}

	public void eat() {

		System.out.println("eating");

	}

}
