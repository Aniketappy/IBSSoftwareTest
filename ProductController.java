package com.shopping.demo.controller;

import com.shopping.demo.model.ProductResponse;
import com.shopping.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;


@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/fetchProductDetails")
    public List<ProductResponse> getAllProducts(){

        List<ProductResponse> productDetails = productService.getProducts();

        return productDetails;
    }

    @GetMapping("/buyProduct/{productName}/{count}")
    public List<ProductResponse> getUpdatedProductDetails(@PathVariable("productName") String productName,
                                                          @PathVariable("count") int count){

        List<ProductResponse> productDetails = productService.getUpdatedProductDetails(productName, count);

        return productDetails;
    }



}
