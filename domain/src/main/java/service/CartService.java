package service;

import lombok.RequiredArgsConstructor;
import pojos.Cart;
import pojos.CartItem;
import pojos.CartPrice;
import ports.ProductServiceFeignClientPort;

import java.util.Set;

@RequiredArgsConstructor
public class CartService {

    private final ProductServiceFeignClientPort feignClientPort;

    public Cart createCart() {
        return new Cart();
    }

    public Cart addProductToCart(Long productId, int productQuantity, Set<Long> optionIds) {
        Cart cart = createCart();
        CartItem productWithItsConfiguration = feignClientPort.getProductWithItsConfiguration(productId, productQuantity, optionIds);
        cart.getCartItems().add(productWithItsConfiguration);
        CartPrice calculatedCartPrice = CartPriceCalculator.calculate(cart.getCartItems());
        cart.setPrice(calculatedCartPrice);
        return cart;
    }
}
