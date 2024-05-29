package com.sapo.edu.demo.untils;
import java.util.Scanner;

import org.apache.commons.lang3.ArrayUtils;
public class ArrayHandler {
	 public static void useArrayUtils() {
		 int[] oldArray = {1,2,3,4,5};
		 for(int i = 0; i < ArrayUtils.getLength(oldArray);i++){
			 System.out.print(oldArray[i] + " ");
		 }
		System.out.println();
		System.out.println("Them vao mang 6");
		 int[] newArray = ArrayUtils.add(oldArray, 6);
		 for(int i = 0; i < ArrayUtils.getLength(newArray);i++){
			 System.out.print(newArray[i] + " ");
		 }
	    }

}
