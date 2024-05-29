package com.sapo.edu.demo;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("console")
public class PrinterConsole implements Printer {
    @Override
    public void printCustoner(Customer customer) {
        System.out.println("CustomerId: " + customer.getAcctNo() + ", balance: " + customer.getBalance().toString());
    }

    @Override
    public void printMessage(String message) {
        System.out.println(message);
    }
}
