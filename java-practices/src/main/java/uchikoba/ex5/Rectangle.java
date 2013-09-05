package uchikoba.ex5;

/**
 * 矩形クラス
 * 
 */
public class Rectangle {

	/** 高さ */
	private double height;
	/** 幅 */
	private double width;

	/**
	 * コンストラクタ
	 * 
	 * @param height 高さ
	 * @param width 幅
	 * @throws RuntimeException 実行時例外
	 */
	public Rectangle(double height, double width) throws RuntimeException {

		if (height < 0 || width < 0) {
			throw new RuntimeException();
		}

		this.height = height;
		this.width = width;
	}

	/**
	 * 面積計算
	 * 
	 * @return 面積
	 */
	public double calcArea() {
		return height * width;
	}

}
