package uchikoba.ex1;

/**
 * 円クラス
 * 
 */
public class Circle {

	/** 円の半径 */
	private double r;

	public Circle(double hankei) {
		this.r = hankei;
	}

	/**
	 * 面積を計算する
	 * 
	 * @return 円の面積
	 */
	public double mensekiKeisan() {
		return Math.pow(this.r, 2) * Math.PI;
	}

	/**
	 * 円周を計算する
	 * 
	 * @return 円周
	 */
	public double ensyuKeisan() {
		return this.r * 2 * Math.PI;
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