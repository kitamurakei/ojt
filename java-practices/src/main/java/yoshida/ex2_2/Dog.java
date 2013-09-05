package yoshida.ex2_2;

public class Dog {
	
	private String name;
	private int year;
	private String bark;
	
	public String getBark() {
		return bark;
	}

	public void setBark(String bark) {
		this.bark = bark;
	}

	public void setName(String name) {		
		this.name = name;
	}
	
	public String getName() {		
		return name;
	}
	
	public void setYear(int year){
		this.year=year;
	}
	
	public int getYear(){
		return year;
	}
	
	//鳴き方判定
	public void bark(String name,int year){
		if(5 > year){
			bark = "キャンキャン";
		}else if(10 < year){
			bark = "クンクン";
		}else{
			bark = "わんわん";
		}
		
		System.out.println(name+"は" + year + "才です。" + bark + "鳴きます。");
		
	}
	

}
