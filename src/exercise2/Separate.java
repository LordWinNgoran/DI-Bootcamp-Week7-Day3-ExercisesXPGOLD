// Exercise 2 : Comma Separated
/*
* @author: N'goran Kouadio Jean Cyrille
* @description:Write a method that returns a comma-separated string based on a given list of integers.
* Each element should be preceded by the letter e if the number is even, and preceded by the letter o if the number is odd.
* date: 08/02/2023
*/


package exercise2;

import java.util.List;
import java.util.stream.Collectors;

public class Separate {
	 public static String getString(List<Integer> list) {
	        // Convert to String
	        return list.stream()
	                   // add e or o before each string
	                   .map(n -> (n % 2 == 0 ? "e" : "o") + n)
	                   //Collect all data transformed
	                   .collect(Collectors.joining(","));
	    }

}
