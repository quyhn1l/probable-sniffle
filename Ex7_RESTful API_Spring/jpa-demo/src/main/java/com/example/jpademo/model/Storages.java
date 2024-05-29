package com.example.jpademo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Storages {
    @Id
    private  int storageId;
    private String storageCode;
    private String storageName;
    private String storageAddress;
    private String storageDescribe;
    private Date storageCreatedDate;
    private Date storageModifyDate;
}
