/**
 * 
 * @author Casual
 * @version 1.0
 * @since 2-21-22
 * 
 * Student class
 * <p>
 * This is the class for a student which includes an assortment of variables,
 * a nested Course() class, and a printSchedule() method.
 * </p>
 */

public class Student {
	/**
	 * private float attribute
	 */
	private float gpa;
	/**
	 * private int attribute
	 */
	private int age;
	/**
	 * private String attribute
	 */
	private String major;
	/**
	 * private String attribute
	 */
	private String firstname;
	/**
	 * private String attribute
	 */
	private String lastname;
	/**
	 * private String attribute
	 */
	private String department;
	

	class Course {

		// in this program the method is used by all the same and its a hardcoded print
		// statement;
		// since there are no varying attributes using this without an input of Student
		// s would work.
		// though I will use Student as an input to display how we can easily assign
		// this to class related
		// attributes.
		
		/**
		 * method for printing schedule
		 */
		void printSchedule() {

			System.out.println("CS 151 Tues/Thurs 5:15-6:30 ");
			System.out.println("CS 146 Mon/Weds 7:15-8:30 ");
			System.out.println("CS 147 Friday 7:15-8:30 ");
		}
	}

	// setters

	public int setAge(int age) {

		this.age = age;

		return age;
	}

	public String setFirstname(String firstname) {

		this.firstname = firstname;

		return firstname;
	}

	public String setLastname(String lastname) {

		this.lastname = lastname;

		return lastname;
	}

	public String setMajor(String major) {

		this.major = major;

		return major;
	}

	public float setGpa(float gpa) {

		this.gpa = gpa;

		return gpa;
	}

	public int setDepartment(String department) {

		this.department = department;

		return age;
	}

	Student(float gpa, int age, String major, String department, String firstname, String lastname) {

		setAge(age);
		setGpa(gpa);
		setMajor(major);
		setDepartment(department);
		setFirstname(firstname);
		setLastname(lastname);

	}

}
