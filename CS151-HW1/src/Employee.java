
public class Employee extends Person {

	public Employee(String firstname, String lastname, int age, int ssn, String address, String gen, float weight,
			int employeeId, String employeeStat, double basePay) {
		super(firstname, lastname, age, ssn, address, gen, weight);
		setEmployeeId(employeeId);
		setBasePay(basePay);
		setEmployeeStat(employeeStat);

		// TODO Auto-generated constructor stub
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public double getBasePay() {
		return basePay;
	}

	public void setBasePay(double basePay) {
		this.basePay = basePay;
	}

	public String getEmployeeStat() {
		return employeeStat;
	}

	public void setEmployeeStat(String employeeStat) {
		this.employeeStat = employeeStat;
	}

	// test
	protected int employeeId;
	protected double basePay;
	protected String employeeStat;

	void introduce(Employee e) {

		System.out.println(e.employeeId);
		System.out.println(e.basePay);
		System.out.println(e.employeeStat);
		System.out.println(e.age);
		System.out.println(e.firstname);
		System.out.println(e.lastname);
		System.out.println(e.ssn);
		System.out.println(e.weight);
		System.out.println(e.address);
		System.out.println(e.gen);
	}

	double calculatePay(double unitsWorked) {
		double hoursWeeks = unitsWorked;
		double pay = basePay;
		String full = "full time";
		String part = "part time";
		String contract = "contractor";
		String stat = employeeStat;

		if (full.equals(employeeStat))
		// calculate pay for full time
		{
			double payment = basePay * 1 / 52 * hoursWeeks;
			return payment;
		}

		/*
		 * else if (part.equals(employeeStat))
		 * 
		 * { // calculate part time pay
		 * 
		 * }
		 */
		else

		{
			double payment = basePay * hoursWeeks;

			return payment;
		}

	}

}
