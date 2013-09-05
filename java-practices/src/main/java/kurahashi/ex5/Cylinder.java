package kurahashi.ex5;

/**
 * 円柱ｸﾗｽ
 * 
 * @since 2013/08/31
 */
public class Cylinder {
	
	/** 底面(円) */
	private Circle circle;
	/** 側面(長方形) */
	private Rectangle rectangle;
	
	/**
	 * ｺﾝｽﾄﾗｸﾀｰ
	 * 底面(円)の半径と高さを指定してください
	 * 
	 * @param circleRadius 底面(円)の半径
	 * @param height 高さ
	 * @since 2013/08/31
	 */
	public Cylinder(double circleRadius, double height){
		
		circle = new Circle(circleRadius);
		rectangle = new Rectangle(height, circle.calculateCircumference());
		
	}
	
	/**
	 * 円柱の体積を計算する
	 * 
	 * @return 体積
	 * @since 2013/08/31
	 */
	public double calculateVolume() {
		return circle.calculateArea() * rectangle.getHeight();
	}
	
	/**
	 * 円柱の表面積を計算する
	 * 
	 * @return 表面積
	 * @since 2013/08/31
	 */
	public double calculateSurfaceArea() {
		return circle.calculateArea() * 2 + rectangle.calculateArea();
	}
	
	/**
	 * 底面(円)の半径を取得する
	 * 
	 * @return 底面(円)の半径
	 * @since 2013/08/31
	 */
	public double getCircleRadius() {
		return circle.getRadius();
	}
	
	/**
	 * 底面(円)の半径を設定する
	 * 
	 * @param circleRadius 底面(円)の半径
	 * @since 2013/08/31
	 */
	public void setCircleRadius(double circleRadius) {
		circle.setRadius(circleRadius);
		rectangle.setWidth(circle.calculateCircumference());
	}
	
	/**
	 * 高さを取得する
	 * 
	 * @return 高さ
	 * @since 2013/08/31
	 */
	public double getHeight() {
		return rectangle.getHeight();
	}
	
	/**
	 * 高さを設定する
	 * 
	 * @param height 高さ
	 * @since 2013/08/31
	 */
	public void setHeight(double height){
		rectangle.setHeight(height);
	}
}
