/**
 * 
 * @author Matthew Scully
 * @version 1.0
 * @since 2-21-22
 * 
 * AnimalTest class
 * <p>
 * This is the AnimalTest class used for creating an instance of the animals
 * and calling each of their respective functions.
 * </p>
 */
public class AnimalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cat = new Cat();
		Dog dog = new Dog();
		Whale whale = new Whale();
		Racoon racoon = new Racoon();

		System.out.println("Cat commands: ");
		// cat commands
		cat.walk();
		cat.greetHuman();
		cat.scratch();
		cat.move();
		cat.eat();
		cat.sleep();
		cat.sound();
		cat.toString();

		System.out.println();
		System.out.println("Dog commands: ");
		// dog commands

		dog.bark();
		dog.walk();
		dog.greetHuman();
		dog.move();
		dog.eat();
		dog.sleep();
		dog.sound();
		dog.toString();

		System.out.println();
		System.out.println("Whale commands: ");
		// whale commands

		whale.swim();
		whale.move();
		whale.eat();
		whale.sleep();
		whale.sound();
		whale.toString();

		System.out.println();
		System.out.println("Racoon commands: ");
		// racoon commands

		racoon.scratch();
		racoon.move();
		racoon.eat();
		racoon.sleep();
		racoon.sound();
		racoon.toString();
	}

}
