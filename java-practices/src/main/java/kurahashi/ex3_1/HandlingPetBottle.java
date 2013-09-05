package kurahashi.ex3_1;

public class HandlingPetBottle{

	public static void main(String[] args) {
		
		// ジュースを買う
		PetBottle juicePet = new PetBottle("ジュース", 500, 500);
		// ジュースを飲む
		juicePet.drink(100);
		// ジュースの残量を確認する
		System.out.println("残量は:" + juicePet.getRemaining());
	
	}

}