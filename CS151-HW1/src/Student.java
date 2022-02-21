/**
 * 
 * 
 * @author Matthew Scully
 * @version 1.0
 * @since 2/8/22
 * 
 *        <h1>Simple Student Test program /
 *        <h1>
 * 
 *
 */

//static keyword makes it so that you can use the method without creating an object.

//setters set the value of a class variable using the value provided in the constructor parameter.

//getters are methods invoked in order to retrieve this value.

//this. is used as such in the following example

/*
 * public int setAge(age) { this.age = age;
 *
 * return age; }
 */

//

public class Student {

	private float gpa;
	private int age;
	private String major;
	private String firstname;
	private String lastname;
	private String department;

	class Course {

		// in this program the method is used by all the same and its a hardcoded print
		// statement;
		// since there are no varying attributes using this without an input of Student
		// s would work.
		// though I will use Student as an input to display how we can easily assign
		// this to class related
		// attributes.

		void printSchedule(Student s) {

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
