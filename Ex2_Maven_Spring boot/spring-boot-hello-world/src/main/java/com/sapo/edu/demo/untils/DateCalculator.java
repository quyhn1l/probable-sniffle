package com.sapo.edu.demo.untils;
import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
public class DateCalculator {
	public static void usingDateUtils(){
		 Date currentDate = new Date();

	     // Add one day to the current date
	     Date tomorrow = DateUtils.addDays(currentDate, 1);

	     // Subtract one week from the current date
	     Date oneWeekAgo = DateUtils.addWeeks(currentDate, -1);

	     // Check if two dates are on the same day
	     boolean sameDay = DateUtils.isSameDay(currentDate, tomorrow);

	     // Print out the results
	     System.out.println("Current Date: " + currentDate);
	        System.out.println("Tomorrow: " + tomorrow);
	        System.out.println("One week ago: " + oneWeekAgo);
	        System.out.println("Is tomorrow the same day as today? " + sameDay);
	}
	
     
}
