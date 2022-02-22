/**
 * 
 * @author Casual
 * @version 1.0
 * @since 2-21-22
 * 
 * Person class
 * <p>
 * This is the class for a person which includes an assortment of variables,
 * an overriden toString() method, and the introduce method.
 * </p>
 */
public class Person {
	/**
	 * protected int attribute
	 */
	protected int age;
	/**
	 * protected String attribute
	 */
	protected String firstname;
	/**
	 * protected String attribute
	 */
	protected String lastname;
	/**
	 * protected float attribute
	 */
	protected float weight;
	/**
	 * protected String attribute
	 */
	protected String address;
	/**
	 * protected int attribute
	 */
	protected int ssn;
	/**
	 * protected String attribute
	 */
	protected String gen;
	/**
	 * Overridden toString method, this method could print out all attributes
	 * @return string with attributes
	 */
	@Override
	public String toString() {
		String returnString = " age: " + age + " ssn: " + ssn + " weight: " + weight + " firstname: " + firstname
				+ " lastname: " + lastname + " address: " + address + " gen: " + gen;
		System.out.println(returnString);
		return returnString;
	}

	/**
	 * method for displaying attributes of a person
	 * @param p which is a person with these attributes
	 */
	public void introduce(Person p) {

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
