package com.example.jpademo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.sql.Date;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Categories {
    @Id
    private int categoryId;
    private String categoryCode;
    private String categoryName;
    private String categoryDescribe;
    private Date categoryCreatedDate;
    private Date categoryModifyDate;
}
