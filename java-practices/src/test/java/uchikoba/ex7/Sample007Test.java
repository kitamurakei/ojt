package uchikoba.ex7;

import static uchikoba.ex7.Sample007.isContainString;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Sample007Test {

	@Test
	public void testCase1() {
		assertFalse(isContainString(null, null));
	}

	@Test
	public void testCase2() {
		assertFalse(isContainString(null, "hoge"));
	}

	@Test
	public void testCase3() {
		assertFalse(isContainString("hoge", null));
	}

	@Test
	public void testCase4() {
		assertTrue(isContainString("hoge", "1hoge23"));
	}

	@Test
	public void testCase5() {
		assertFalse(isContainString("hoge", "1ho2ge"));
	}

}
