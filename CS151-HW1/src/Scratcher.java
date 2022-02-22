/**
 * 
 * @author Casual
 * @version 1.0
 * @since 2-21-22
 * 
 * Scratcher interface
 * <p>
 * Interface which includes the scratch() method.
 * </p>
 */
public interface Scratcher {
	/**
	 * method for scratching
	 */
	default void scratch() {
		System.out.println("scratching");
	}

}
