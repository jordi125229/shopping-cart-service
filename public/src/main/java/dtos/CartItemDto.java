package dtos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pojos.CartItemOption;
import pojos.Price;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
public class CartItemDto {
    private Long id;
    private String name;
    private PriceDto price;
    private String type;
    private Integer quantity;
    private Set<CartItemOption> options;
}
