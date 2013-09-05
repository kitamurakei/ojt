package kurahashi.ex5;

import org.junit.BeforeClass;
import org.junit.Test;


public class CylinderTest {

	/** 円錐 */
	static Cylinder cylinder;
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("setUpBeforeClass");
		cylinder = new Cylinder(5, 10);
	}

	@Test
	public void testCalculateVolume() {
		System.out.println("底面(円)の半径が" + cylinder.getCircleRadius() + "で高さが"
			+ cylinder.getHeight() + "の円柱の体積は" + cylinder.calculateVolume() + "です。");
	}

	@Test
	public void testCalculateSurfaceArea() {
		System.out.println("底面(円)の半径が" + cylinder.getCircleRadius() + "で高さが"
			+ cylinder.getHeight() + "の円柱の表面積は" + cylinder.calculateSurfaceArea() + "です。");
	}

}
