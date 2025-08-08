package com.ecomerce.app.model;

import org.springframework.stereotype.Component;

@Component
public class CartValidator implements Cart {

    @Override
    public boolean validateCart(String cartId) {
        return "CART001".equalsIgnoreCase(cartId);
    }
}