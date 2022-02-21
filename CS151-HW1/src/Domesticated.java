
interface Domesticated {

	default void walk() {
		System.out.println("walking");
	}

	default void greetHuman() {
		System.out.println("hi human");
	}

}