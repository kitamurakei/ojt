package kurahashi.ex4;

import org.junit.BeforeClass;
import org.junit.Test;


public class EvenOddCheckTest {
	
	static int num;
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("setUpBeforeClass");
		num = (int)(100 * Math.random());
	}

	@Test
	public void testCheckEven() {
		System.out.println(num + "は偶数");
		if (EvenOddCheck.checkEven(num)) {
			System.out.println("です。");
		} else {
			System.out.println("ではない。");
		}
	}

	@Test
	public void testCheckOdd() {
		System.out.println(num + "は奇数");
		if (EvenOddCheck.checkOdd(num)) {
			System.out.println("です。");
		} else {
			System.out.println("ではない。");
		}
	}

}
