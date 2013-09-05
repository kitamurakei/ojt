package uchikoba.ex5;

import uchikoba.ex1.Circle;

/**
 * 円柱クラス
 * 
 */
public class Cylinder {

	// 円クラス
	private Circle circle;
	// 矩形クラス
	private Rectangle side;
	// 円柱の高さ
	private double height;

	/**
	 * 円柱コンストラクタ(円と矩形の概念を持つ)
	 * 
	 * @param hankei 底面の半径
	 * @param height 円柱の高さ
	 */
	public Cylinder(double hankei, double height) {

		this.height = height;

		// 円ｵﾌﾞｼﾞｪｸﾄ生成
		circle = new Circle(hankei);

		// 矩形(側面)ｵﾌﾞｼﾞｪｸﾄ生成
		side = new Rectangle(height, circle.ensyuKeisan());

	}

	/**
	 * 円柱の表面積を計算する
	 * 
	 * @return 円柱の表面積
	 */
	public double calcCylinderArea() {
		return circle.mensekiKeisan() * 2 + side.calcArea();
	}

	/**
	 * 円柱の体積を計算する
	 * 
	 * @return 円柱の体積
	 */
	public double calcCylinderVolume() {
		return circle.mensekiKeisan() * height;
	}

}
