package dtos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
public class ProductConfigurationDto {

    private ProductDto product;
    private Set<ProductOptionDto> selectedOptions;
}
