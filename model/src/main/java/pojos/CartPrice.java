package pojos;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
@RequiredArgsConstructor
public class CartPrice {

    private final BigDecimal totalNetPrice;
    private final Map<BigDecimal, BigDecimal> vatByRate;
    private final BigDecimal totalGrossPrice;

}
