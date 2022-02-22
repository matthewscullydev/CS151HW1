/**
 * 
 * @author Matthew Scully
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

/**
 * 
 * @author Matthew Scully
 * @version 1.0
 * @since 2-21-22
 * 
 * Domesticated interface
 * <p>
 * Interface which includes the walk() and greetHuman() methods.
 * </p>
 */
public interface Domesticated {
	/**
	 * method for walking
	 */
	default void walk() {
		System.out.println("walking");
	}
	/**
	 * method for greeting human
	 */
	default void greetHuman() {
		System.out.println("hi human");
	}

}
