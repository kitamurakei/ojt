package kurahashi.ex2;

/**
 * ﾒｲﾝｸﾗｽ
 *
 */
class DogPen {
	public static void main(String[] args) {
		Dog pochi = new Dog();
		pochi.setName("ぽち");

		pochi.setYears(1);
		System.out.print(pochi.getYears() + "歳の" + pochi.getName() + "が鳴いた: ");
		pochi.bark();

		pochi.setYears(6);
		System.out.print(pochi.getYears() + "歳の" + pochi.getName() + "が鳴いた: ");
		pochi.bark();

		pochi.setYears(15);
		System.out.print(pochi.getYears() + "歳の" + pochi.getName() + "が鳴いた: ");
		pochi.bark();
	}
}

/**
 * 犬ｸﾗｽ
 *
 */
class Dog {
	
	/** 名前 */
	private String name;
	/** 年齢 */
	private int years;
	
	/*
	 * ｺﾝｽﾄﾗｸﾀ
	 *
	 */
	public Dog() {
	}
	

	/**
	 * 鳴き声を出力する
	 *
	 */
	public void bark() {
		if (years < 5) {
			System.out.println("キャンキャン");
		} else if (years < 10) {
			System.out.println("ワンワン");
		} else {
			System.out.println("クンクン");
		}
	}

	/**
	 * 名前を取得する
	 *
	 */
	public String getName() {
		return name;
	}

	/**
	 * 名前を設定する
	 *
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 年齢を取得する
	 *
	 */
	public int getYears() {
		return years;
	}

	/**
	 * 年齢を設定する
	 *
	 */
	public void setYears(int years) {
		this.years = years;
	}

}