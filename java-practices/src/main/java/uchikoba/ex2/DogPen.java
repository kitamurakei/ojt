package uchikoba.ex2;

/**
 * 現実世界の犬
 * 
 */
public class DogPen {

	public static void main(String[] args) {

		Dog dog = new Dog();
		dog.setName("くらはし");
		dog.setYear(4);
		dog.bark();

		dog.setName("よしだ");
		dog.setYear(9);
		dog.bark();

		dog.setName("きたむら");
		dog.setYear(12);
		dog.bark();

	}

}
