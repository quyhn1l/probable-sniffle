package com.example.jpademo.service;

import com.example.jpademo.model.Categories;
import com.example.jpademo.repository.CategoriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriesService {
    @Autowired
    private CategoriesRepository repository;

    public Categories getStoragesById(int id){
        return repository.findById(id).orElse(null);
    }
}
