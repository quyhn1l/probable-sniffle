package com.example.jpademo.repository;

import com.example.jpademo.model.Storages;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StoragesRepository extends JpaRepository<Storages, Integer> {

}
