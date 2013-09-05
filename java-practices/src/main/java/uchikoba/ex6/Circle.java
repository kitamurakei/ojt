package uchikoba.ex6;

public class Circle implements Twodimensions {

	/** 円の半径 */
	private double r;

	/**
	 * コンストラクタ
	 * 
	 * @param hankei 円の半径
	 */
	public Circle(double hankei) {
		
		if(hankei < 0) {
			throw new RuntimeException();
		}
		
		this.r = hankei;
	}

	/**
	 * 円の面積を計算し返却する
	 * 
	 * @return 円の面積
	 */
	public double calcArea() {
		return Math.pow(this.r, 2) * Math.PI;
	}

	/**
	 * 円の半径を返却する
	 * 
	 * @return 円の半径
	 */
	public double getHankei() {
		return r;
	}

}