package kurahashi.ex3_2;

import java.util.Random;

import kurahashi.ex3_1.PetBottle;


public class CompetitionDrink {
	
	public static void main(String[] args){
		
		// ホロちゃんのペットボトル
		PetBottle jolosPet = new PetBottle("水", 500, 500);
		// ロレンスくんのペットボトル
		PetBottle lawrencesPet = new PetBottle("水", 500, 500);
		
		Random random = new Random();
		
		// 
		int second = 0;
		while (jolosPet.getRemaining() != 0 && lawrencesPet.getRemaining() != 0) {
			jolosPet.drink(random.nextInt(100));
			lawrencesPet.drink(random.nextInt(85));
			
			second++;
			System.out.println(second + "秒経過：現在の残量は\nホロちゃん" + jolosPet.getRemaining() 
				+ "\nロレンスくん" + lawrencesPet.getRemaining() + "\nです。" );
		}
		System.out.println(second + "秒飲んだ結果:\n");
		if (jolosPet.getRemaining() == 0) {
			if (lawrencesPet.getRemaining() == 0){
				System.out.println("引き分けです。");
			} else {
				System.out.println("ホロちゃんの勝ちです。");
			}
		} else {
			System.out.println("ロレンスくんの勝ちです。");
		}
	}

}
