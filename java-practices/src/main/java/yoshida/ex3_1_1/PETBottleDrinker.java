package yoshida.ex3_1_1;

public class PETBottleDrinker {
	public static void main(String[] args) {

		PETBottle pet = new PETBottle();

		pet.setName("コーヒー");
		pet.setBaseVolume(100);
		//pet.setVolume(-10);

		// 飲む量を決める
		pet.drunk(50);
		// 飲む量を決める
		pet.drunk(30);

		// 同じ飲み物で量だけを変更
		pet.setBaseVolume(1000);
//		pet.setVolume(100);
//		pet.drunk();
//		pet.setVolume(200);
//		pet.drunk();
		
	}
}

class PETBottle {

	/** 飲み物の名前 */
	private String name = null;
	/** 残量 */
	private int base_volume;
	/** 飲む量 */
	private int volume;

	public void setName(String name) {
		this.name = name;
	}

//	public void setVolume(int volume) {
//		if (base_volume < volume || volume < 0) {
//			System.out.println("設定エラー");
//		} else {
//			this.volume = volume;
//		}
//	}

	public void setBaseVolume(int base_volume) {
		if (base_volume <= 0) {
			System.out.println("設定エラー");
		} else {
			this.base_volume = base_volume;
		}
	}

	/**
	 * 飲み物の残量を算出して出力する
	 */
	public void drunk() {
		base_volume -= volume;

		System.out.println(name + "の残りは" + base_volume + "しかないよ");

	}
	
	public void drunk(int volume) {
		if (base_volume < volume || base_volume <= 0) {
			System.out.println("量の設定を見直してください");
		} else {
			base_volume -= volume;

			System.out.println(name + "の残りは" + base_volume + "しかないよ");
		}
	}
	
}
