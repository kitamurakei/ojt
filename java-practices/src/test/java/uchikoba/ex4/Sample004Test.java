package uchikoba.ex4;

import static org.junit.Assert.*;
import static uchikoba.ex4.Sample004.isEvenNumber;

import org.junit.Test;

public class Sample004Test {

	@Test
	public void isEvenNumberﾒｿｯﾄﾞは0を偶数と判断する() {
		assertTrue(isEvenNumber(0));
	}

	@Test
	public void isEvenNumberﾒｿｯﾄﾞは10を偶数と判断する() {
		assertTrue(isEvenNumber(10));
	}

	@Test
	public void isEvenNumberﾒｿｯﾄﾞは1を偶数でないと判断する() {
		assertFalse(isEvenNumber(1));
	}

	@Test(expected = RuntimeException.class)
	public void isEvenNumberﾒｿｯﾄﾞは負の数ある場合例外を投げる() {
		isEvenNumber(-1);
		fail("到達してはだめだよ");
		
	}

}
