package com.sapo.edu.demo;
import com.sapo.edu.demo.untils.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.apache.commons.lang3.time.StopWatch;

import java.util.Scanner;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		while (true){
			System.out.println("Chọn chức năng");
			System.out.println("1. Sử dụng hàm StopWatch");
			System.out.println("2. Sử dụng StringUtils");
			System.out.println("3. Sử dụng ArrayUtils");
			System.out.println("4. Sử dụng DateUtils");
			int choice = scanner.nextInt();
			switch (choice) {
				case 1:
					long executionTime = TimeCalculator.measureExecutionTime(() -> {
						try {
							Thread.sleep(5000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					});
					System.out.println("Execution time: " + executionTime  +" milliseconds");

					break;
				case 2:
					StringHandler.useStringUtils();
					break;
				case 3:
					ArrayHandler.useArrayUtils();
					break;
				case 4:
					DateCalculator.usingDateUtils();
					break;
			}
			System.out.println();
		}



	}
}
