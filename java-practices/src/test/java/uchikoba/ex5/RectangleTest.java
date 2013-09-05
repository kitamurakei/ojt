package uchikoba.ex5;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class RectangleTest {

	@Test
	public void test1() {
		Rectangle rect = new Rectangle(10.123, 3.999);
		assertEquals(40.481877, rect.calcArea(), 0.0);
	}

	@Test
	public void test2() {
		Rectangle rect = new Rectangle(0, 3.999);
		assertEquals(0, rect.calcArea(), 0.0);
	}

	public void test3() {
		Rectangle rect = new Rectangle(43.234, 0);
		assertEquals(0, rect.calcArea(), 0.0);
	}

	@Test(expected = RuntimeException.class)
	public void test4() {
		Rectangle rect = new Rectangle(-43.234, 3.999);
		rect.calcArea();
		fail("到達してはだめよ");
	}

}
