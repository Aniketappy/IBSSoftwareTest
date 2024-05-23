package com.shopping.demo.service;

import com.shopping.demo.model.Product;
import com.shopping.demo.model.ProductResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class ProductService {

    @Autowired
    InventoryService inventoryService;
    public List<ProductResponse> getProducts(){

        List<ProductResponse> productResponseList = new ArrayList<>();


        List<Product> productList = new ArrayList<>();
        Product product1 = new Product("1", "Jeans", 100);

        Product product2 = new Product("2", "Shirt", 200);
        productList.add(product1);
        productList.add(product2);

        for (Product prd : productList) {
            int inventoryDetails = inventoryService.inventoryDetails(prd.getName());
            ProductResponse productResponse = new ProductResponse();
            productResponse.setProduct(prd);
            productResponse.setValue(inventoryDetails);

            productResponseList.add(productResponse);
        }

        return productResponseList;
    }

    public List<ProductResponse> getUpdatedProductDetails(String productName, int count){

        List<ProductResponse> productResponseList = new ArrayList<>();


        List<Product> productList = new ArrayList<>();
        Product product1 = new Product("1", "Jeans", 100);

        Product product2 = new Product("2", "Shirt", 200);
        productList.add(product1);
        productList.add(product2);

        for (Product prd : productList) {
            int inventoryDetails = inventoryService.updatedInventoryDetails(prd.getName(), count);

            //Upadated Inventory value
            int updatedInventoryValue = inventoryDetails - count;

            ProductResponse productResponse = new ProductResponse();
            productResponse.setProduct(prd);
            productResponse.setValue(updatedInventoryValue);

            productResponseList.add(productResponse);
        }

        return productResponseList;
    }

}
