package app;

import dtos.CartDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pojos.Cart;

import java.util.Set;

@RestController
@RequiredArgsConstructor
@RequestMapping("/cart")
public class Controller {

    private final AppService service;
    private final CartItemsMapper mapper;

    @PostMapping("/add/{productId}/{productQuantity}")
    public CartDto addProductToCart(@PathVariable Long productId, @PathVariable int productQuantity, @RequestParam Set<Long> optionIds) {
        Cart cart = service.addProductToCart(productId, productQuantity, optionIds);
        return mapper.toCartDto(cart);
    }
}
