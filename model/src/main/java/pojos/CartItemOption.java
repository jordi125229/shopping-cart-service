package pojos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CartItemOption {
    private Long id;
    private String name;
    private Price price;
    private String type;
}
