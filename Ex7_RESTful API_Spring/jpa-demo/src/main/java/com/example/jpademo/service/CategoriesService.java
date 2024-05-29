package com.example.jpademo.service;

import com.example.jpademo.model.Categories;

import java.util.List;

public interface CategoriesService {
    public List<Categories> listAllCategories();
    public Categories getCategoryById(Integer id);
    public Categories saveCategory(Categories category);

    public void deleteCategory(Integer id);

    Categories updateCategory(Integer id, Categories category);
}
