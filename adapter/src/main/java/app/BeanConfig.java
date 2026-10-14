package app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ports.ProductServiceFeignClientPort;
import service.CartService;

@Configuration
public class BeanConfig {

    @Bean
    public CartService cartService(ProductServiceFeignClientPort productPort) {
        return new CartService(productPort);
    }
}
