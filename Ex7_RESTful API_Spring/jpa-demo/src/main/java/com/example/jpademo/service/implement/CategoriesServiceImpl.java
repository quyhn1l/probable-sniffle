package com.example.jpademo.service.implement;

import com.example.jpademo.model.Categories;
import com.example.jpademo.model.Products;
import com.example.jpademo.repository.CategoriesRepository;
import com.example.jpademo.repository.ProductsRepository;
import com.example.jpademo.service.CategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriesServiceImpl implements CategoriesService {
    @Autowired
    CategoriesRepository repository;
    @Autowired
    ProductsRepository productsRepository;
    @Override
    public List<Categories> listAllCategories() {
        return repository.findAll();
    }

    @Override
    public Categories getCategoryById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Categories saveCategory(Categories category) {
        return repository.save(category);
    }

    @Override
    @Transactional
    public void deleteCategory(Integer id) {
        Optional<Categories> categoryOptional = repository.findById(id);

    }

    @Override
    public Categories updateCategory(Integer id, Categories category) {
        Categories categoryFromDB = getCategoryById(id);
        if (category.getCategoryCode() != null) {
            categoryFromDB.setCategoryCode(category.getCategoryCode());
        }
        if (category.getCategoryName() != null) {
            categoryFromDB.setCategoryName(category.getCategoryName());
        }
        if (category.getCategoryDescribe() != null) {
            categoryFromDB.setCategoryDescribe(category.getCategoryDescribe());
        }
        if (category.getCategoryCreatedDate() != null) {
            categoryFromDB.setCategoryCreatedDate(category.getCategoryCreatedDate());
        }
        if (category.getCategoryModifyDate() != null) {
            categoryFromDB.setCategoryModifyDate(category.getCategoryModifyDate());
        }
        return saveCategory(categoryFromDB);
    }
}
