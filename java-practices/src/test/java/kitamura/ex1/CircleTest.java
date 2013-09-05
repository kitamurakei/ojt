package kitamura.ex1;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.math.RoundingMode;

import org.junit.Test;

public class CircleTest {

	@Test
	public void testCalcArea() {
		Circle circle = new Circle(50);
		double actual = circle.calcArea();
		assertThat(actual, is(new Double(7853.981633974483)));
	}

	@Test
	public void testCalcPeriphery() {
		Circle circle = new Circle(3);
		double actual = circle.calcPeriphery();
		assertThat(actual, is(new Double(18.84955592153876)));
	}
	
	@Test
	public void testCalcAreaRoundFloor() {
		Circle circle = new Circle(50, RoundingMode.FLOOR, 2);
		double actual = circle.calcArea();
		assertThat(actual, is(new Double(7853.98)));
	}

	@Test
	public void testCalcAreaRoundUp() {
		Circle circle = new Circle(50, RoundingMode.UP, 2);
		double actual = circle.calcArea();
		assertThat(actual, is(new Double(7853.99)));
	}

	@Test
	public void testCalcAreaRoundHalfUp() {
		Circle circle = new Circle(50, RoundingMode.HALF_UP, 2);
		double actual = circle.calcArea();
		assertThat(actual, is(new Double(7853.98)));
	}

}
