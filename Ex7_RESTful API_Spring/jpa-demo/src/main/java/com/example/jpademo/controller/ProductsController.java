package com.example.jpademo.controller;

import com.example.jpademo.model.Products;
import com.example.jpademo.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductsController {

    @Autowired
    private ProductsService productsService;

    @GetMapping("/admin/products")
    public List<Products> findAllProducts() {
        return productsService.listAllProducts();
    }

    @GetMapping("/admin/products/{id}")
    public Products findProduct(@PathVariable(value = "id") Integer productId){
        return productsService.getProductById(productId);
    }

    @PostMapping("/admin/products")
    public Products createProduct(@RequestBody Products product) {
        return productsService.saveProduct(product);
    }

    @PutMapping("/admin/products/{id}")
    public Products updateProduct(@PathVariable(value = "id") Integer productId, @RequestBody Products product){
        return productsService.updateProduct(productId, product);
    }

    @DeleteMapping("/admin/products/{id}")
    public void deleteProduct(@PathVariable(value = "id") Integer productId){
        productsService.deleteProduct(productId);
    }
}