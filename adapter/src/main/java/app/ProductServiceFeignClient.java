package app;

import dtos.ProductConfigurationDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Set;

@FeignClient(name = "productService", url = "${product-service.url}")
public interface ProductServiceFeignClient {

    @PostMapping("/products/option-assign/{productId}/{productQuantity}")
    ProductConfigurationDto chooseOption(@PathVariable Long productId, @PathVariable int productQuantity, @RequestParam Set<Long> optionIds);
}
