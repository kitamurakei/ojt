package yoshida.ex4;

/**
 * 数字が偶数か奇数かを判定する
 * 
 * @since 2013/09/03
 */
public class CheckNum {

	/**
	 * 偶数か奇数かを判定し、結果を表示する。<br>
	 * 0または負の値が入力された場合はエラーを返す。
	 * 
	 * @param num 数字
	 * @return
	 * @since 2013/09/03
	 */
	public int check(int num) {

		if (num <= 0) {
			throw new ArithmeticException("正の整数を入力してください");
		} else if (0 != num % 2) {
			return 1;
		} else {
			return 0;
		}
	}

}
