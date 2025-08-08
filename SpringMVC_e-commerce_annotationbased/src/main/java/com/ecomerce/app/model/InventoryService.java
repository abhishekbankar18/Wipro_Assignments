package com.ecomerce.app.model;

import org.springframework.stereotype.Component;
import java.util.Arrays;
import java.util.List;

@Component
public class InventoryService implements Inventory {

    private static final List<String> availableItems = Arrays.asList("ITEM001", "ITEM002", "ITEM003");

    @Override
    public boolean isAvailable(String itemId) {
        return availableItems.contains(itemId);
    }
}