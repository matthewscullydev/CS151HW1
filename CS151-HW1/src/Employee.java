
public class Employee extends Person {

	Employee(String firstname, String lastname, int age, int ssn, String address, String gen, float weight,
			String employeeStat, double basePay) {
		super(firstname, lastname, age, ssn, address, gen, weight);
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

	private int employeeId;
	private double basePay;
	private String employeeStat;

	int calculatePay(int basePay, String employeeStat) {
		int pay = basePay;
		String full = "full time";
		String part = "part time";
		String contract = "contractor";
		String stat = employeeStat;

		if (full.equals(employeeStat))
		// calculate pay for full time
		{

		}

		else if (part.equals(employeeStat))

		{
			// calculate part time pay

		}

		else

		{
			// contractor pay

		}

		return pay;
	}

}
