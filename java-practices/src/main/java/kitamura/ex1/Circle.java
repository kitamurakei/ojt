package kitamura.ex1;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Circle {

	/** 円周率 */
	private BigDecimal pi = new BigDecimal(Math.PI);
	
	/** 半径 */
	private BigDecimal radius;

	/** 端数処理 */
	private RoundingStrategy strategy;
	
	/**
	 * コンストラクタ（端数処理なし）
	 * 
	 * @param radius 半径
	 * @param roundingMode {@link BigDecimal}の端数処理モード
	 * @param scale 端数処理桁数
	 */
	public Circle(double radius) {
		this.radius = new BigDecimal(radius);
		this.strategy = new Null();
	}

	/**
	 * コンストラクタ（端数処理あり）
	 * 
	 * @param radius 半径
	 * @param roundingMode {@link BigDecimal}の端数処理モード
	 * @param scale 端数処理桁数
	 */
	public Circle(double radius, RoundingMode roundingMode, int scale) {
		this.radius = new BigDecimal(radius);
		this.strategy = new NormalRoundingStrategy(roundingMode, scale);
	}
	
	/**
	 * 円の面積を計算する
	 * 
	 * @return 面積
	 */
	public double calcArea() {
		BigDecimal bd = radius.multiply(radius).multiply(pi);
		bd = strategy.round(bd);
		return bd.doubleValue();
	}

	/**
	 * 円の外周を計算する
	 * 
	 * @return 外周
	 */
	public double calcPeriphery() {
		BigDecimal bd = radius.multiply(new BigDecimal(2)).multiply(pi);
		bd = strategy.round(bd);
		return bd.doubleValue();
	}
	
	public BigDecimal getRadius() {
		return radius;
	}

	public void setRadius(BigDecimal radius) {
		this.radius = radius;
	}
	
}
