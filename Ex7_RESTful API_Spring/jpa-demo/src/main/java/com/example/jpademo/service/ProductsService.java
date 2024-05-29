package com.example.jpademo.service;

import com.example.jpademo.model.Products;

import java.util.List;

public interface ProductsService {
    public List<Products> listAllProducts();
    public Products getProductById(Integer id);

    public Products saveProduct(Products product);
    public void deleteProduct(Integer id);
    public Products updateProduct(Integer id, Products product);
}
