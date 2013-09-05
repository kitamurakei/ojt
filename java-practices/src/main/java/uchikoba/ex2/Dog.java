package uchikoba.ex2;

/**
 * 犬クラス
 * 
 */
public class Dog {

	// 名前
	private String name;
	// 泣き声
	private String nakigoe;
	// 年齢
	private int year;

	/**
	 * 鳴く
	 */
	void bark() {

		// 年齢によって鳴き声が変更
		if (this.year < 5) {
			this.nakigoe = DogConstants.NAKIGOE_KYANKYAN;
		} else if (this.year >= 5 && year < 10) {
			this.nakigoe = DogConstants.NAKIGOE_WANWAN;
		} else {
			this.nakigoe = DogConstants.NAKIGOE_KUNKUN;
		}

		System.out.println(this.year + "才の" + this.name + "が" + this.nakigoe + "とないたよ");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
}