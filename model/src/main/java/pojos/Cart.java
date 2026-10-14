package pojos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
public class Cart {

    private CartPrice price;
    private List<CartItem> cartItems = new ArrayList<>();
}
