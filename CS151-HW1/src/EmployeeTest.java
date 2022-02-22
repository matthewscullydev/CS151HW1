/**
 * 
 * @author Matthew Scully
 * @version 1.0
 * @since 2-21-22
 * 
 * EmployeeTest class
 * <p>
 * Test class which creates 5 employees, introduces them, and calculates their pay.
 * </p>
 */
public class EmployeeTest {

	public static void main(String[] args) {

		Employee emp = new Employee("Joe", "Smith", 21, 123332132, "2134 Nugent Rd", "Male", (float) 146.7, 123423,
				"contractor", (double) 60);

		emp.introduce(emp);
		emp.calculatePay(30);

		Employee emp2 = new Employee("Lisa", "Gray", 29, 238203182, "4734 Stanton Ave", "Female", (float) 158.1, 233421,
				"full time", (double) 110000);

		emp2.introduce(emp2);
		emp2.calculatePay(2);

		Employee emp3 = new Employee("Timothy", "Briggs", 41, 177332432, "2139 Far Rd", "Male", (float) 220.7, 543768,
				"full time", (double) 80000);

		emp3.introduce(emp3);
		emp3.calculatePay(4);

		Employee emp4 = new Employee("George", "Wallace", 88, 127892132, "4433 Ayaed Rd", "Male", (float) 133.9, 123233,
				"part time", (double) 20);

		emp.introduce(emp4);
		emp.calculatePay(25);

		Employee emp5 = new Employee("Amy", "Student", 19, 325335132, "8893 Cary Ave", "Female", (float) 116.7, 987423,
				"contractor", (double) 45);

		emp.introduce(emp5);
		emp.calculatePay(45);

	}

}
