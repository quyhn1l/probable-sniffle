package com.example.jpademo.service;

import com.example.jpademo.model.Products;
import com.example.jpademo.repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductsService {
    @Autowired
    private ProductsRepository repository;

    public Products getProductById(int id){
        return repository.findById(id).orElse(null);
    }
}
