package kitamura.ex1;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class NormalRoundingStrategy implements RoundingStrategy {

	private RoundingMode roundingMode;
	
	private int scale;
	
	public NormalRoundingStrategy(RoundingMode roundingMode, int scale) {
		this.roundingMode = roundingMode;
		this.scale = scale;
	}
	
	public BigDecimal round(BigDecimal bd) {
		return bd.setScale(scale, roundingMode);
	}

}