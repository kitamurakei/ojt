package yoshida.ex1;

public class Circle_bk {
	
	private int r;
	private int pai;
	
	public int area (int r, int p){
		
		//面積を求める
			return r*r*p;
		
	}
		
	public int periphery  (int r, int p){
		
		//外周を求める
			return 2*r*p;
		
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public int getPai() {
		return pai;
	}

	public void setPai(int pai) {
		this.pai = pai;
	}
	
	

}

