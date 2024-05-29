package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {
    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password) {
        Customer customer = customerRepository.findByUsernameAndPassword(username, password);
        if (customer.getUsername() != null) {
            return "Welcome, " + customer.getUsername() + "!";
        } else {
            return "Invalid username or password.";
        }
    }
}
