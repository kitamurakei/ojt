package kitamura.ex1;

import java.math.BigDecimal;

public class Null implements RoundingStrategy {

	public BigDecimal round(BigDecimal bd) {
		return bd;
	}
}
