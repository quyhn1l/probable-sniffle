package com.example.jpademo.controller;

import com.example.jpademo.model.Storages;
import com.example.jpademo.service.StoragesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StoragesController {

    @Autowired
    private StoragesService storageService;

    @GetMapping("/admin/storages")
    public List<Storages> findAllStorages() {
        return storageService.listAllStorages();
    }

    @GetMapping("/admin/storages/{id}")
    public Storages findStorage(@PathVariable(value = "id") Integer storageId){
        return storageService.getStorageById(storageId);
    }

    @PostMapping("/admin/storages")
    public Storages createStorage(@RequestBody Storages storage) {
        return storageService.saveStorage(storage);
    }

    @PutMapping("/admin/storages/{id}")
    public Storages updateStorage(@PathVariable(value = "id") Integer storageId, @RequestBody Storages storage){
        return storageService.updateStorage(storageId, storage);
    }

    @DeleteMapping("/admin/storages/{id}")
    public void deleteStorage(@PathVariable(value = "id") Integer storageId){
        storageService.deleteStorage(storageId);
    }
}
