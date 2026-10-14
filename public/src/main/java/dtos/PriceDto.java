package dtos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
public class PriceDto {

    private BigDecimal netPrice;
    private BigDecimal grossPrice;
    private Double taxRate;
}
