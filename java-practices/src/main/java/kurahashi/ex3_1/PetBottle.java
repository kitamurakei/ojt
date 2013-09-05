package kurahashi.ex3_1;

public class PetBottle {

	/** 名前 */
	private String name;
	/** 残量 */
	private int remaining;
	/** 容量 */
	private int capacity;


	/**
	 * 名前と残量と容量を指定するｺﾝｽﾄﾗｸﾀ
	 *
	 * @param name 名前
	 * @param remaining 残量
	 * @param capacity 容量
	 */
	public PetBottle(String name, int remaining, int capacity) {
		this.name = name;
		this.remaining = remaining;
		this.capacity = capacity;
	}

	/**
	 * 内容物を飲む
	 *
	 * @param amout 飲む量
	 */
	public void drink(int amount) {

		if (remaining < amount) {
			this.remaining = 0;
		} else {
			remaining = remaining - amount;
		}

	}

	/**
	 * 内容物を補充する
	 *
	 * @param amout 補充する量
	 */
	public void supplementation(int amout) {

		remaining = remaining + amout;
		if (capacity < remaining) {
			remaining = capacity;
		}

	}

	/**
	 * 名前を取得する
	 *
	 * @return 名前
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * 名前を設定する
	 *
	 * @param name 名前
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 残量を取得する
	 *
	 * @return 残量
	 */
	public int getRemaining() {
		return this.remaining;
	}

}