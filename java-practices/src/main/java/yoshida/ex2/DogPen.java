package yoshida.ex2;

public class DogPen {
	public static void main(String[] args) {

		Dog dog = new Dog("ララ",15);
		// 鳴き声を設定
		dog.bark();
	}
}

class Dog {

	private String name;
	private int year;
	private String bark;
	
	/**
	 * 名前と年齢を持たせる
	 * @param name
	 * @param year
	 */
	Dog(String name,int year){
		this.name = name;
		this.year = year;
	}

	/**
	 * 鳴き方設定
	 * 
	 * @param name
	 * @param year
	 */
	public void bark() {
		if (5 > year) {
			bark = "キャンキャン";
		} else if (5 <= year && 10 < year) {
			bark = "クンクン";
		} else {
			bark = "わんわん";
		}
		System.out.println(name + "は" + year + "才です。" + bark + "鳴きます。");

	}

}
