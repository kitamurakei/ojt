package kitamura.ex1;

import java.math.BigDecimal;

public interface RoundingStrategy {

	public BigDecimal round(BigDecimal bd);
}
