package com.example.jpademo.service.implement;


import com.example.jpademo.model.Storages;
import com.example.jpademo.repository.ProductsRepository;
import com.example.jpademo.repository.StoragesRepository;
import com.example.jpademo.service.StoragesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Date;
import java.util.List;


@Service
public class StoragesServiceImpl implements StoragesService {

    @Autowired
    StoragesRepository repository;
    ProductsRepository productsRepository;

    @Override
    public List<Storages> listAllStorages() {
        return repository.findAll();
    }

    @Override
    public Storages getStorageById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Storages saveStorage(Storages storage) {
        return repository.save(storage);
    }

    @Transactional
    @Override
    public void deleteStorage(Integer id) {
        productsRepository.deleteAll(productsRepository.findByStorageId(id));
        repository.deleteById(id);
    }

    @Override
    public Storages updateStorage(Integer id, Storages storage) {
        Storages storageFromDB = getStorageById(id);
        if (storageFromDB != null) {
            if (storage.getStorageCode() != null) {
                storageFromDB.setStorageCode(storage.getStorageCode());
            }
            if (storage.getStorageName() != null) {
                storageFromDB.setStorageName(storage.getStorageName());
            }
            if (storage.getStorageAddress() != null) {
                storageFromDB.setStorageAddress(storage.getStorageAddress());
            }
            if (storage.getStorageDescribe() != null) {
                storageFromDB.setStorageDescribe(storage.getStorageDescribe());
            }
            if (storage.getStorageCreatedDate() != null) {
                storageFromDB.setStorageCreatedDate(storage.getStorageCreatedDate());
            }
            Date currentDate = new Date(System.currentTimeMillis());
            storageFromDB.setStorageModifyDate(currentDate);
            return saveStorage(storageFromDB);
        }
        return null;
    }
}