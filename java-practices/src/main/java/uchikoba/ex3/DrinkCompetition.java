package uchikoba.ex3;

/**
 * ドリンク競争
 * 
 */
public class DrinkCompetition {

	public static void main(String[] args) {

		// ジョン残量
		int johnDrinkVolume;
		// ポール残量
		int paulDrinkVolume;

		PETBottle john = new PETBottle();
		john.setVolume(500);

		PETBottle paul = new PETBottle();
		paul.setVolume(500);

		// 経過時間
		int second = 0;

		// 飲む量を決定し、飲む！！
		while (john.getVolume() != 0 && paul.getVolume() != 0) {
			johnDrinkVolume = (int) (Math.random() * 100);
			paulDrinkVolume = (int) (Math.random() * 100);
			john.drunk(johnDrinkVolume);
			paul.drunk(paulDrinkVolume);
			second++;
		}

		// 勝ち負け出力
		if (john.getVolume() == 0 && paul.getVolume() == 0) {
			System.out.println(second + "秒で飲んで同点");
		} else if (john.getVolume() == 0) {
			System.out.println(second + "秒で飲んでジョンのかち");
		} else if (paul.getVolume() == 0) {
			System.out.println(second + "秒で飲んでぽーるのかち");
		}
	}

}
