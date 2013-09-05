package kurahashi.ex1;

/**
 * ﾒｲﾝｸﾗｽ
 *
 */
public class PropertyOfCircle {
	public static void main(String[] args) {
		// 円オブジェクトを生成する 
		Circle circle = new Circle();
		
		// 円の半径を設定するメソッドを実行
		circle.setRadius(5);

		System.out.println("Area: " + circle.calculateArea() );
		System.out.println("Outline: " + circle.calculateCircumference() );
	}
}
/**
 * 円ｸﾗｽ
 *
 */
class Circle {

	/** 半径 */
	private int radius;

	/**
	 * 半径を取得する
	 *
	 */
	public int getRadius() {
		return radius;
	}

	/**
	 * 半径を設定する
	 *
	 */
	public void setRadius(int radius) {
		this.radius = radius;
	}

	/**
	 * 面積を計算する
	 *
	 */
	public int calculateArea() {
		return radius * radius * 3;
	}

	/**
	 * 円周を計算する
	 *
	 */
	public int calculateCircumference() {
		return radius * 2 * 3;
	}
}