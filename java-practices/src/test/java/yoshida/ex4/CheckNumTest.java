package yoshida.ex4;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;


public class CheckNumTest {

	@Test
	public void testCase1() {
		assertThat(new CheckNum().check(3), is(1));
	}
	
	@Test
	public void testCase2() {
		assertThat(new CheckNum().check(10), is(0));
	}
	
	@Test(expected=ArithmeticException.class)
	public void testCase3() {
	 new CheckNum().check(0);
	 fail("例外が発生してない！");
	}
	
	@Test(expected=ArithmeticException.class)
	public void testCase4() {
	 new CheckNum().check(-100);
	 fail("例外が発生してない！");
	}

	
}
