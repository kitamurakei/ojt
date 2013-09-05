package uchikoba.ex5;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.lang.reflect.Field;

import org.junit.BeforeClass;
import org.junit.Test;

import uchikoba.ex1.Circle;

public class CylinderTest {

	static Circle mocCircle;
	static Rectangle mocRect;
	static Cylinder cyl;

	@BeforeClass
	public static void setBeforeClass() throws Exception {

		// 円のモッククラス
		Circle mocCircle = mock(Circle.class);
		// 円の面積を差込
		mocCircle = when(mock(Circle.class).mensekiKeisan()).thenReturn(1.2345).getMock();
		// 矩形のモッククラス
		Rectangle mocRect = mock(Rectangle.class);
		// 矩形の面積を差込
		mocRect = when(mock(Rectangle.class).calcArea()).thenReturn(9.9999).getMock();

		// 円柱のprivateなフィールド(円クラス、矩形クラス)を差し替え
		cyl = new Cylinder(10, 20.12345);
		Field circleField = cyl.getClass().getDeclaredField("circle");
		circleField.setAccessible(true);
		circleField.set(cyl, mocCircle);
		circleField.setAccessible(false);
		Field rectField = cyl.getClass().getDeclaredField("side");
		rectField.setAccessible(true);
		rectField.set(cyl, mocRect);
		rectField.setAccessible(false);

	}

	@Test
	public void test1() {

		// 底面積*2+側面積
		assertThat(cyl.calcCylinderArea(), is(1.2345 * 2 + 9.9999));

	}

	@Test
	public void test2() {

		// 底面積*高さ
		assertThat(cyl.calcCylinderVolume(), is(1.2345 * 20.12345));

	}

}
