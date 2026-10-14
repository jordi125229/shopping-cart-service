package dtos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pojos.CartItem;
import pojos.CartPrice;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class CartDto {
    private CartPriceDto price;
    private List<CartItemDto> cartItems;
}
