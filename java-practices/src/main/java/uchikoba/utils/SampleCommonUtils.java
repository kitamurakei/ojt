package uchikoba.utils;

import java.math.BigDecimal;

/**
 * サンプルユーティリティクラス
 * 
 */
public class SampleCommonUtils {

	/**
	 * 引数のdouble値を、指定したｽｹｰﾙ及び丸め方で処理した結果を返却する
	 * 
	 * @param targetValue 対象値
	 * @param scale ｽｹｰﾙ
	 * @param roundingType 丸め方(1:ROUND_DOWN 2:ROUND_UP) 指定以外はROUND_DOWNとする。
	 * @return 結果
	 */
	public static double roundingScale(double targetValue, int scale, int roundingType) {

		int roundType = 1;

		if (roundingType == 1) {
			roundType = BigDecimal.ROUND_DOWN;
		} else if (roundingType == 2) {
			roundType = BigDecimal.ROUND_UP;
		}

		BigDecimal bd = new BigDecimal(targetValue);
		return bd.setScale(scale, roundType).doubleValue();
	}

}
