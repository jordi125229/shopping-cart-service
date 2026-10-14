package app;

import dtos.CartDto;
import dtos.PriceDto;
import dtos.ProductConfigurationDto;
import dtos.ProductOptionDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import pojos.Cart;
import pojos.CartItem;
import pojos.CartItemOption;
import pojos.Price;

@Mapper(componentModel = "spring")
public interface CartItemsMapper {

    @Mapping(target = "id", source = "product.id")
    @Mapping(target = "name", source = "product.name")
    @Mapping(target = "price", source = "product.price")
    @Mapping(target = "type", source = "product.type")
    @Mapping(target = "quantity", source = "product.quantity")
    @Mapping(target = "options", source = "selectedOptions")
    CartItem toCartItem(ProductConfigurationDto source);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "name", source = "name")
    @Mapping(target = "price", source = "price")
    @Mapping(target = "type", source = "type")
    CartItemOption toCartItemOption(ProductOptionDto source);

    @Mapping(target = "netPrice", source = "netPrice")
    @Mapping(target = "grossPrice", source = "grossPrice")
    @Mapping(target = "taxRate", source = "taxRate")
    Price toPrice(PriceDto source);

    @Mapping(target = "netPrice", source = "netPrice")
    @Mapping(target = "grossPrice", source = "grossPrice")
    @Mapping(target = "taxRate", source = "taxRate")
    PriceDto toPriceDto(Price source);

    CartDto toCartDto(Cart cart);

}
