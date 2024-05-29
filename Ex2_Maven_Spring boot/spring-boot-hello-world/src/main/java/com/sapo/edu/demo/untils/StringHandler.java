package com.sapo.edu.demo.untils;
import org.apache.commons.lang3.StringUtils;
import java.util.Scanner;
public class StringHandler {
    public static void useStringUtils() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào một chuỗi:");
        String input = scanner.nextLine();

        System.out.println("Độ dài của chuỗi là: " + StringUtils.length(input));
    }
}
