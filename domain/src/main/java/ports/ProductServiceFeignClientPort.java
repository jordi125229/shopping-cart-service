package ports;

import pojos.CartItem;

import java.util.Set;

public interface ProductServiceFeignClientPort {

    CartItem getProductWithItsConfiguration(Long productId, int productQuantity, Set<Long> optionIds);
}
