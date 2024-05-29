package com.example.jpademo;

import com.example.jpademo.model.Categories;
import com.example.jpademo.model.Products;
import com.example.jpademo.model.Storages;
import com.example.jpademo.service.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class JpaDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(JpaDemoApplication.class, args);
		CategoriesService categoriesService = context.getBean(CategoriesService.class);
		ProductsService productsService = context.getBean(ProductsService.class);
		StoragesService storagesService = context.getBean(StoragesService.class);

		System.out.println(categoriesService.getCategoryById(6));



	}


}
