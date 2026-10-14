package pojos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
public class CartItem {
    private Long id;
    private String name;
    private Price price;
    private String type;
    private Integer quantity;
    private Set<CartItemOption> options;
}
