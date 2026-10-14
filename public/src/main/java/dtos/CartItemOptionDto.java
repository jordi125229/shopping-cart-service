package dtos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pojos.Price;

@Getter
@Setter
@NoArgsConstructor
public class CartItemOptionDto {
    private Long id;
    private String name;
    private Price price;
    private String type;
}
