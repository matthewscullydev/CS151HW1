
public class Person {

	private int age;
	private String firstname;
	private String lastname;
	private float weight;
	private String address;
	private int ssn;
	private String gen;

	@Override
	public String toString() {
		String returnString = " age: " + age + " ssn: " + ssn + " weight: " + weight + " firstname: " + firstname
				+ " lastname: " + lastname + " address: " + address + " gen: " + gen;
		System.out.println(returnString);
		return returnString;
	}

	public void Introduce(Person p) {

		System.out.println(p.age);
		System.out.println(p.firstname);
		System.out.println(p.lastname);
		System.out.println(p.ssn);
		System.out.println(p.weight);
		System.out.println(p.address);
		System.out.println(p.gen);

	}

	// setters

	public int setAge(int age) {

		this.age = age;

		return age;
	}

	public int setSsn(int ssn) {

		this.ssn = ssn;

		return ssn;
	}

	public String setFirstname(String firstname) {

		this.firstname = firstname;

		return firstname;
	}

	public String setLastname(String lastname) {

		this.lastname = lastname;

		return lastname;
	}

	public String setGen(String gen) {

		this.gen = gen;

		return gen;

	}

	public String setAddress(String address) {

		this.address = address;

		return address;

	}

	public float setWeight(float weight) {

		this.weight = weight;

		return weight;

	}

	Person(String firstname, String lastname, int age, int ssn, String address, String gen, float weight) {

		setAge(age);
		setSsn(ssn);
		setFirstname(firstname);
		setLastname(lastname);
		setGen(gen);
		setWeight(weight);
		setAddress(address);

	}

}
