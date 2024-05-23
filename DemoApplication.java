package com.shopping.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
/*

[4:12 PM] Dhaneesh K P
        Implement a Shopping Controller to expose APIs for managing shopping cart operations.

        Implement 2 APIs:

        Get all products : Returns a list of all products with inventory.

        Purchase product: Handles the purchase of a product, updating the inventory accordingly.

        Define the structure of Product and Inventory as specified.

        Product Structure  [ static list ]

        id,name,rate .

        Inventory Structure

        id,qty [Static Map] .


 */