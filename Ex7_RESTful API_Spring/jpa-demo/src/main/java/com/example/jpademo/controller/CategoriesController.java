package com.example.jpademo.controller;

import com.example.jpademo.model.Categories;
import com.example.jpademo.service.CategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;;

import java.util.List;

@RestController
public class CategoriesController {
    @Autowired
    private CategoriesService categoriesService;
    @GetMapping("/admin/categories")
    public ResponseEntity<List<Categories>> findAllCategories() {
        List<Categories> categories = categoriesService.listAllCategories();
        return new ResponseEntity<>(categories, HttpStatus.OK);
    }
    @GetMapping("/admin/categories/{id}")
    public ResponseEntity<Categories> findCategory(@PathVariable(value = "id") Integer categoryId){
        Categories category = categoriesService.getCategoryById(categoryId);
        return new ResponseEntity<>(category, HttpStatus.OK);
    }
    @PostMapping("/admin/categories")
    public ResponseEntity<Categories> createCategory(@RequestBody Categories category) {
        Categories postedCategory = categoriesService.saveCategory(category);
        return new ResponseEntity<>(postedCategory,HttpStatus.OK);
    }
    @PutMapping("admin/categories/{id}")
    public ResponseEntity<Categories> updateCategory(@PathVariable(value = "id") Integer categoryId, @RequestBody Categories category){
        Categories updatedCategory = categoriesService.updateCategory(categoryId, category);
        return new ResponseEntity<>(updatedCategory,HttpStatus.OK);
    }
    @DeleteMapping("admin/categories/{id}")
    public void deleteCategory(@PathVariable(value = "id") Integer categoryId){
        categoriesService.deleteCategory(categoryId);
    }
}
