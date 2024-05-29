package com.example.jpademo.repository;

import com.example.jpademo.model.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductsRepository extends JpaRepository<Products, Integer> {
    List<Products> findByCategoryId(Integer categoryId);
    List<Products> findByStorageId(Integer storageId);

}
