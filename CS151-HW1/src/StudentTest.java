
public class StudentTest {

	public static void main(String[] args) {

		Student test = new Student((float) 3.6, 20, "Computer Science", "School of Computer Science", "John", "Smith");

		Student.Course testcourse = test.new Course();

		testcourse.printSchedule(test);

	}

}
