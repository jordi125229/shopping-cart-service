package app;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pojos.Cart;
import service.CartService;

import java.util.Set;

@Service
@RequiredArgsConstructor
public class AppService {

    private final CartService service;

    public Cart addProductToCart(Long productId, int quantity, Set<Long> optionIds) {
        return service.addProductToCart(productId, quantity, optionIds);
    }
}
