package yoshida.ex3_2;

public class DrinkCompetition {
	public static void main(String[] args) {

		PETBottle pet1 = new PETBottle("お茶");
		PETBottle pet2 = new PETBottle("コーヒー");
		
		//毎秒飲む量を設定
		int DrinkRate1 = 13;
		int DrinkRate2 = 109;
		
		while(0 < pet1.getBaseVolume() && 0 < pet2.getBaseVolume()){
			pet1.drunk(DrinkRate1);
			pet2.drunk(DrinkRate2);
		}

		if(pet1.getBaseVolume() == pet2.getBaseVolume()){
			System.out.println("引き分け");
		}else if(pet1.getBaseVolume() < pet2.getBaseVolume()){
			System.out.println("1の勝ち");
		}else if(pet2.getBaseVolume() < pet1.getBaseVolume()){
			System.out.println("2の勝ち");
		}
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
		setBaseVolume(volume);
	}

	/**
	 * 内容量を設定する
	 * 
	 * @param volume int
	 */
	public void setBaseVolume(int volume){
		if (volume < 0) {
			System.out.println("マイナス値は設定できません");
		}else{
			this.base_volume = volume;
		}
		}
	
	/**
	 * 内容量を取得する
	 * @param volume int
	 */
	public int getBaseVolume(){
		return base_volume;
		}

	/**
	 * 飲んだ分だけ内容量を減らす 
	 * 
	 * @param volume int 飲む量
	 */
	public void drunk(int volume) {
		if (base_volume < volume) {
			//残量以上の量を飲もうとした場合は残量を0にする
			base_volume = 0;
		} else {
			base_volume -= volume;
		}
	}
}
