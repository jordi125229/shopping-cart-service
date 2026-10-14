package dtos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pojos.Price;

@NoArgsConstructor
@Setter
@Getter
public class ProductOptionDto {
    private Long id;
    private String name;
    private PriceDto price;
    private String type;
}
