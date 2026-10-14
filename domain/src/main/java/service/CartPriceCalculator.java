package service;

import pojos.*;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class CartPriceCalculator {

    public static CartPrice calculate(Collection<CartItem> configurations) {
        BigDecimal totalNet = BigDecimal.ZERO;
        BigDecimal totalGross = BigDecimal.ZERO;

        Map<BigDecimal, BigDecimal> vatByRate = new HashMap<>();

        for (CartItem configuration : configurations) {
            int quantity = configuration.getQuantity();

            Price productPrice = configuration.getPrice();

            totalNet = totalNet.add(productPrice.getNetPrice().multiply(BigDecimal.valueOf(quantity)));

            totalGross = totalGross.add(productPrice.getGrossPrice().multiply(BigDecimal.valueOf(quantity)));
            addVat(vatByRate, productPrice, quantity);
            for (CartItemOption option : configuration.getOptions()) {
                Price optionPrice = option.getPrice();
                totalNet = totalNet.add(optionPrice.getNetPrice().multiply(BigDecimal.valueOf(quantity)));
                totalGross = totalGross.add(optionPrice.getGrossPrice().multiply(BigDecimal.valueOf(quantity)));
                addVat(vatByRate, optionPrice, quantity);
            }
        }
        return new CartPrice(totalNet, Map.copyOf(vatByRate), totalGross);
    }

    private static void addVat(Map<BigDecimal, BigDecimal> vatByRate, Price price, int quantity) {
        Double rate = price.getTaxRate();
        BigDecimal vat = price.getGrossPrice().subtract(price.getNetPrice()).multiply(BigDecimal.valueOf(quantity));
        vatByRate.merge(BigDecimal.valueOf(rate), vat, BigDecimal::add);
    }
}

