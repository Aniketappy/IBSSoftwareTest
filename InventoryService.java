package com.shopping.demo.service;

import java.util.HashMap;
import java.util.Map;

public class InventoryService {

    public int inventoryDetails(String name){

        Map<String, Integer> inventoryMap = new HashMap<>();

        inventoryMap.put("Jeans", 15);
        inventoryMap.put("Shirt", 25);

        return inventoryMap.get(name);
    }

    public int updatedInventoryDetails(String name, int count){

        Map<String, Integer> inventoryMap = new HashMap<>();

        inventoryMap.put("Jeans", 15);
        inventoryMap.put("Shirt", 25);

        int updatedCount = inventoryMap.get(name) - count;
        return updatedCount;
    }


}
