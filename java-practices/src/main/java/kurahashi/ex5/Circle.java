package kurahashi.ex5;

/**
 * 円ｸﾗｽ
 * 
 * @since 2013/08/31
 */
public class Circle {

	/** 半径 */
	private double radius;
	
	/**
	 * ｺﾝｽﾄﾗｸﾀｰ
	 * 
	 * @param radius 半径(整数限定)
	 * @since 2013/08/31
	 */
	public Circle(double radius) {
		this.radius = radius;
	}
	
	/**
	 * 面積を計算する
	 * 
	 * @return 面積
	 * @since 2013/08/31
	 */
	public double calculateArea() {
		
		return Math.pow(radius, 2) * Math.PI;
		
	}
	
	/**
	 * 円の外周を計算する
	 * 
	 * @return 外周の長さ
	 * @since 2013/08/31
	 */
	public double calculateCircumference() {
		
		return radius * 2 * Math.PI;
		
	}

	/**
	 * 半径を取得する
	 * 
	 * @return 半径
	 * @since 2013/08/31
	 */
	public double getRadius() {
		return radius;
	}

	/**
	 * 半径を設定する
	 * 
	 * @param radius 半径
	 * @since 2013/08/31
	 */
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
}
