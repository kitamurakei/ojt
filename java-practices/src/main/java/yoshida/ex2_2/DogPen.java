package yoshida.ex2_2;


public class DogPen {
	public static void main(String[] args) {

		Dog dog = new Dog();

		// 名前を設定
//		dog.setName("ララ");
		String name = dog.getName();

		// 年齢を設定
		dog.setYear(5);
		int year = dog.getYear();

		// 鳴き声を設定
		//Dog dog2 = new Dog(name, year);
		dog.bark(name, year);
		//dog.show();
	}

}
