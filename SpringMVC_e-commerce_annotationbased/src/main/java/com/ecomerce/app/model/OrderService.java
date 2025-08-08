package com.ecomerce.app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class OrderService implements Orders {

    @Autowired
    private InventoryService inventoryService;

    @Autowired
    private CartValidator cartValidator;

    @Override
    public String checkout(String cartId) {
        if (!cartValidator.validateCart(cartId)) {
            return "Cart is invalid";
        }

        Order order = new Order();
        order.setOrderId(cartId);
        order.setItemIds(Arrays.asList("ITEM001", "ITEM002")); // Dummy items

        for (String item : order.getItemIds()) {
            if (!inventoryService.isAvailable(item)) {
                return "Item out of stock";
            }
        }

        return "Checkout successful for " + cartId;
    }
}