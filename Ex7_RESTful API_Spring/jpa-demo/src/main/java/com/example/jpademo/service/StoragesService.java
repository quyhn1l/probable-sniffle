package com.example.jpademo.service;

import com.example.jpademo.model.Products;
import com.example.jpademo.model.Storages;

import java.util.List;

public interface StoragesService {
    public List<Storages> listAllStorages();
    public Storages getStorageById(Integer id);

    public Storages saveStorage(Storages storage);
    public void deleteStorage(Integer id);
    public Storages updateStorage(Integer id, Storages storage);
}
