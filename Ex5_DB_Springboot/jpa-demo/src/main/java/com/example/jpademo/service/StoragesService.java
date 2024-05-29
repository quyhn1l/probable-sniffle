package com.example.jpademo.service;
import com.example.jpademo.model.Storages;
import com.example.jpademo.repository.StoragesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StoragesService {
    @Autowired
    private StoragesRepository repository;

    public Storages getStoragesById(int id){
        return repository.findById(id).orElse(null);
    }
}
