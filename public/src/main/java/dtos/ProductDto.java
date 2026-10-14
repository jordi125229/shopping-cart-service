package dtos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pojos.Price;


import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
public class ProductDto {
    private Long id;
    private String name;
    private PriceDto price;
    private String type;
    private Integer quantity;
    private Set<ProductOptionDto> options;
}
