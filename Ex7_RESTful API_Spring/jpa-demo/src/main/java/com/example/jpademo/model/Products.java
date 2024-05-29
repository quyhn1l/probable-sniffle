package com.example.jpademo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Products {
    @Id
    private int productId;
    private String productName;
    private String productCode;
    private int productPrice;
    private String productDescribe;
    private String productImagePath;
    private int productInStorage;
    private int boughtProductNumber;
    private int categoryId;
    private int storageId;
}
