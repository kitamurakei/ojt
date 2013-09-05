package yoshida.ex1;

public class PropertyOfCircle {

	public static void main(String[] args) {

		//デフォルト
		Circle circle = new Circle();
		
		// 面積
		System.out.println("面積：" + circle.calculate_area());
		// 外周
		System.out.println("外周：" + circle.calculate_periphery());

		// 半径を指定
		Circle circle2 = new Circle(3);

		// 面積
		System.out.println("面積：" + circle2.calculate_area());
		// 外周
		System.out.println("外周：" + circle2.calculate_periphery());

	}
}

class Circle {

	private Integer r = 100;
	private final double pai = 3;
	
	Circle(){
	}
	
	Circle(int r){
		setR(r);
	}

	public double calculate_area() {
		
		if (r == null){
			System.out.println("半径を指定してください");
			return 0;
		} else {

			// 面積を求める
			return r * r * pai;
		}
	}

	public double calculate_periphery() {
		if (r == null){
			System.out.println("半径を指定してください");
			return 0;
		} else {

			// 外周を求める
			return Math.pow(r, 2) * pai;
		}
	}
//
	public void setR(int r) {
		this.r = r;
	}

}