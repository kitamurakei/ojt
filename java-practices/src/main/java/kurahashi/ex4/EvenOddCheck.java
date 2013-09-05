package kurahashi.ex4;


public class EvenOddCheck {
	
	/**
	 * 偶数ﾁｪｯｸ
	 * 
	 * @param num ﾁｪｯｸしたい数値
	 * @return 判定値(偶数だったらtrue)
	 * @since 2013/08/30
	 */
	public static boolean checkEven(int num){
		if ((num & 1) == 0) {
			//　奇数ならtrueをリターン
			return true;
		} 
		//偶数ならfalseをリターン
		return false;
	}
	
	/**
	 * 奇数ﾁｪｯｸ
	 * 
	 * @param num ﾁｪｯｸしたい数値
	 * @return 判定値(奇数だったらtrue)
	 * @since 2013/08/30
	 */
	public static boolean checkOdd(int num){
		if ((num & 1) != 0) {
			//　奇数ならtrueをリターン
			return true;
		} 
		//偶数ならfalseをリターン
		return false;
	}

}
