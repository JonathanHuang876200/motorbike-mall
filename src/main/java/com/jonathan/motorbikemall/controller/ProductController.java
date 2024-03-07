package com.jonathan.motorbikemall.controller;


import com.jonathan.motorbikemall.model.Product;
import com.jonathan.motorbikemall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/products/{productId}")
    public  String getProduct(@PathVariable Integer productId) {
//        ResponseEntity<Product>
//        Product product = productService.getProductById(productId);
//        if(product != null) {
//            return ResponseEntity.status(HttpStatus.OK).body(product);
//        }else {
//            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
//        }
        String Shit = "Shittt";
    return Shit;
    }

}