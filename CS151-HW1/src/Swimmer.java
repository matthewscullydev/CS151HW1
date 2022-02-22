/**
 * 
 * @author Casual
 * @version 1.0
 * @since 2-21-22
 * 
 * Swimmer interface
 * <p>
 * Interface which includes the swim() method.
 * </p>
 */
public interface Swimmer {
	/**
	 * method for swimming
	 */
	default void swim() {
		System.out.println("swimming");
	}

}
