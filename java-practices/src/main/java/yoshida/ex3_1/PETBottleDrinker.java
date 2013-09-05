package yoshida.ex3_1;

public class PETBottleDrinker {
	public static void main(String[] args) {

		PETBottle pet1 = new PETBottle("お茶");
		// 飲む量を決める
		pet1.drunk(100);
		
		//内容量を設定しなおす(注ぎ足す)
		pet1.setBaseVolume(500);
		pet1.drunk(200);
		
		System.out.println(pet1.getName() + "の残りは" + pet1.getBaseVolume() + "しかないよ");
		
		PETBottle pet2 = new PETBottle("コーヒー", 250);
		// 飲む量を決める
		pet2.drunk(100);
		pet2.drunk(200);
		
		System.out.println(pet2.getName() + "の残りは" + pet2.getBaseVolume() + "しかないよ");
		
		
	}
}

class PETBottle {

	/** 飲み物の名前 */
	private String name;
	/** 内容量 */
	private int base_volume;

	/**
	 * 飲み物の名前だけを指定するｺﾝｽﾄﾗｸﾀｰ 内容量は初期値500をｾｯﾄ
	 *
	 * @param name String 飲み物の名前
	 */
	PETBottle(String name) {
		this.name = name;
		this.base_volume = 500;
	}

	/**
	 * 飲み物の名前と内容量を設定するｺﾝｽﾄﾗｸﾀｰ
	 * 
	 * @param name String 飲み物の名前
	 * @param volume int 内容量         
	 * 
	 */

	PETBottle(String name, int volume) {
		this.name = name;
		
		if (volume < 0) {
			System.out.println("マイナス値は設定できません");
		}else{
			this.base_volume = volume;
		}
	}

	/**
	 * 内容量を設定する
	 * 
	 * @param volume int
	 */
	public void setBaseVolume(int volume){
		this.base_volume = volume;
		}
	
	/**
	 * 内容量を取得する
	 * @param volume int
	 */
	public int getBaseVolume(){
		return base_volume;
		}
	
	/**
	 * 内容量を取得する
	 * @param volume int
	 */
	public String getName(){
		return name;
		}

	/**
	 * 飲んだ分だけ内容量を減らす 
	 * 
	 * @param volume int 飲む量
	 */
	public void drunk(int volume) {
		if (base_volume < volume) {
			System.out.println("量の設定を見直してください");
		} else {
			base_volume -= volume;
		}
	}


}
