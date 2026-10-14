package dtos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Map;

@Getter
@Setter
@NoArgsConstructor
public class CartPriceDto {
    private BigDecimal totalNetPrice;
    private Map<BigDecimal, BigDecimal> vatByRate;
    private BigDecimal totalGrossPrice;
}
