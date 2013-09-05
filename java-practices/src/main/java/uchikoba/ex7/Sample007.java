package uchikoba.ex7;

/**
 * Sample007クラス
 * 
 */
public class Sample007 {

	/**
	 * 引数で与えられた対象文字列がチェック文字列に含まれるかを判定します。 含まれる場合True、含まれない場合Falseを返します。
	 * 
	 * @param targetString 対象文字列
	 * @param checkString チェック文字列
	 * @return チェック結果
	 */
	public static boolean isContainString(String targetString, String checkString) {

		// return checkString == null ? false : checkString.matches(".*" +
		// targetString + ".*");

		// boolean result = false;

		if (checkString == null) {
			// return result;
			return false;
		}

		// result = checkString.matches(".*" + targetString + ".*");
		return checkString.matches(".*" + targetString + ".*");
		// return result;

	}

}
