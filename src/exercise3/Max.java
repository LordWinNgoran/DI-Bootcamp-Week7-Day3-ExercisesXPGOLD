// Exercise 3 : Maximal Element In The Range
/*
* @author: N'goran Kouadio Jean Cyrille
* @description: Write a generic method to find the maximal element in the range [begin, end) of a list
* date: 08/02/2023
*/
package exercise3;

import java.util.List;

public class Max {
	public static <T extends Comparable<T>> T findMaximalElement(List<T> list, int begin, int end) {
        // Check if the born is good
        if (begin < 0 || end > list.size() || begin >= end) {
            throw new IllegalArgumentException("Invalid Interval");
        }

        // Set the max by default to the first element
        T max = list.get(begin);
        // navigate to find the max
        for (int i = begin + 1; i < end; i++) {
            T current = list.get(i);
            // Check if the selected elemnt is great that our max
            if (current.compareTo(max) > 0) {
                max = current;
            }
        }
        // Return max value
        return max;
    }
}
