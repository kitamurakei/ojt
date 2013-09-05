package uchikoba.ex1;

import static uchikoba.utils.SampleCommonUtils.roundingScale;

/**
 * 円の面積と外周を求めるプログラム
 * 
 */
public class PropertyOfCircle {

	public static void main(String[] args) {

		Circle circle = new Circle(3);
		System.out.println("面積：" + roundingScale(circle.mensekiKeisan(), 5, 1));
		System.out.println("円周：" + roundingScale(circle.ensyuKeisan(), 5, 1));
	}

}
