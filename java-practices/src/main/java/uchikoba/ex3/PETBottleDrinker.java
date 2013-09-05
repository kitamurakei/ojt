package uchikoba.ex3;

/**
 * ペットボトルを飲むよ
 * 
 */
public class PETBottleDrinker {

	public static void main(String[] args) {

		PETBottle pet = new PETBottle();
		pet.setName("午後の紅茶");
		pet.setVolume(500);
		pet.drunk(600);
		System.out.println(pet.getName() + "の残量は" + pet.getVolume() + "mlだよ");
	}

}
