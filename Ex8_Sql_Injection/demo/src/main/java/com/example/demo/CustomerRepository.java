package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;


public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    Customer findByUsernameAndPassword(String username, String password);
}
