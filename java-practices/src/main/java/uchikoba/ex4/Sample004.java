package uchikoba.ex4;

/**
 * Sample004クラス
 * 
 */
public class Sample004 {

	/**
	 * 引数が偶数であるかを判断します
	 * 
	 * @param number 判定数字
	 * @return 判断結果(偶数:true: 奇数:false)
	 */
	// public static boolean judgeOddOrEven(int number) {
	public static boolean isEvenNumber(int number) {
		
		if(number < 0) {
			throw new RuntimeException();
		}

		// 3項演算子を使いました！！
		return number % 2 == 0 ? true : false;

		// boolean result;
		//
		// if(number % 2 == 0) {
		// result = true;
		// } else {
		// result = false;
		// }
		//
		// return result;
	}

}
