package uchikoba.ex3;

import java.math.BigDecimal;

/**
 * ペットボトルボトルクラス
 * 
 */
public class PETBottle {

	// 飲み物の名前
	private String name;
	// 残量
	private int volume;

	// 飲む
	public void drunk(int nondavolume) {
		if (volume >= nondavolume) {
			this.volume -= nondavolume;
		} else {
			this.volume = BigDecimal.ZERO.intValue();
		}

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

}
