package com.example.jpademo.service.implement;

import com.example.jpademo.model.Products;
import com.example.jpademo.repository.ProductsRepository;
import com.example.jpademo.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductsServiceImpl implements ProductsService {

    @Autowired
    private ProductsRepository repository;

    @Override
    public List<Products> listAllProducts() {
        return repository.findAll();
    }

    @Override
    public Products getProductById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Products saveProduct(Products product) {
        return repository.save(product);
    }

    @Override
    public void deleteProduct(Integer id) {
        Products product = getProductById(id);
        repository.delete(product);
    }

    @Override
    public Products updateProduct(Integer id, Products product) {
        Products productFromDB = getProductById(id);
        if (product.getProductName() != null) {
            productFromDB.setProductName(product.getProductName());
        }
        if (product.getProductCode() != null) {
            productFromDB.setProductCode(product.getProductCode());
        }
        if (product.getProductPrice() != 0) {
            productFromDB.setProductPrice(product.getProductPrice());
        }
        if (product.getProductDescribe() != null) {
            productFromDB.setProductDescribe(product.getProductDescribe());
        }
        if (product.getProductImagePath() != null) {
            productFromDB.setProductImagePath(product.getProductImagePath());
        }
        if (product.getProductInStorage() != 0) {
            productFromDB.setProductInStorage(product.getProductInStorage());
        }
        if (product.getBoughtProductNumber() != 0) {
            productFromDB.setBoughtProductNumber(product.getBoughtProductNumber());
        }
        if (product.getCategoryId() != 0) {
            productFromDB.setCategoryId(product.getCategoryId());
        }
        if (product.getStorageId() != 0) {
            productFromDB.setStorageId(product.getStorageId());
        }
        return saveProduct(productFromDB);
    }

}