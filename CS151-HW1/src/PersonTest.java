
public class PersonTest {

	public static void main(String args[]) {

		Employee emp = new Employee("Bob", "Phillips", 21, 123332132, "2134 Nugent Rd", "Male", (float) 146.7, 123423,
				"full time", (double) 125000);
		Person testperson = new Person("Matthew", "Scully", 21, 231444322, "3032 Bale ave", "Male", (float) 23.4);
		testperson.introduce(testperson);
		System.out.println();
		System.out.println();
		// testperson.toString();
		emp.introduce(emp);
		double pay = emp.calculatePay(18);
		System.out.println(pay);
	}

}
