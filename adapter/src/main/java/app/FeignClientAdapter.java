package app;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import pojos.CartItem;
import ports.ProductServiceFeignClientPort;

import java.util.Set;

@Component
@RequiredArgsConstructor
public class FeignClientAdapter implements ProductServiceFeignClientPort {

    private final ProductServiceFeignClient feignClient;
    private final CartItemsMapper mapper;

    @Override
    public CartItem getProductWithItsConfiguration(Long productId, int quantity, Set<Long> optionIds) {
        dtos.ProductConfigurationDto productConfigurationDto = feignClient.chooseOption(productId, quantity, optionIds);
        return mapper.toCartItem(productConfigurationDto);
    }
}
