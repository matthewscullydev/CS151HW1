/**
 * 
 * @author Matthew Scully
 * @version 1.0
 * @since 2-21-22
 * 
 * StudentTest class
 * <p>
 * This is the class for testing the student class. 
 * This class creates a student and prints its course by creating a course and using the printSchedule method inside the nested course class.
 * </p>
 */
public class StudentTest {

	public static void main(String[] args) {

		Student test = new Student((float) 3.6, 20, "Computer Science", "School of Computer Science", "John", "Smith");

		Student.Course testcourse = test.new Course();

		testcourse.printSchedule();

	}

}
