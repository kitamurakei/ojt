package kurahashi.ex5;

/**
 * 長方形ｸﾗｽ
 * 
 * @since 2013/08/31
 */
public class Rectangle {
	
	/** 高さ */
	private double height;
	/** 幅 */
	private double width;
	
	/**
	 * ｺﾝｽﾄﾗｸﾀｰ
	 * 高さと幅を指定してください
	 * 
	 * @param height
	 * @param width
	 * @since 2013/08/31
	 */
	public Rectangle(double height, double width) {
		this.height = height;
		this.width = width;
	}
	
	/**
	 * 面積を計算する
	 * 
	 * @return 面積
	 * @since 2013/08/31
	 */
	public double calculateArea() {
		
		return height * width;
		
	}

	/**
	 * 高さを取得する
	 * 
	 * @return 高さ
	 * @since 2013/08/31
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * 高さを設定する
	 * 
	 * @param height 高さ
	 * @since 2013/08/31
	 */
	public void setHeight(double height) {
		this.height = height;
	}

	/**
	 * 幅を取得する
	 * 
	 * @return 幅
	 * @since 2013/08/31
	 */
	public double getWidth() {
		return width;
	}

	/**
	 * 幅を設定する
	 * 
	 * @param width 幅
	 * @since 2013/08/31
	 */
	public void setWidth(double width) {
		this.width = width;
	}

}
