package com.sapo.edu.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

@Component
@Profile("log")
public class PrintFile implements Printer {
    String filePath = "./log-message.txt";
    @Override
    public void printCustoner(Customer customer) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filePath, true))) {
            writer.println("CustomerId: " + customer.getAcctNo() + ", balance: " + customer.getBalance());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void printMessage(String message) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filePath, true))) {
            writer.println(message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
