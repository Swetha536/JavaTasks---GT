package org.array;

public class SecondLargest {
	public static void main(String[] args) {
		int arr[] = {100,1200,300,400,500};
		int largest = arr[0];
		int secondLargest = Integer.MIN_VALUE;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > largest) {
				largest = arr[i];
				} else if (arr[i] > secondLargest && arr[i] != largest) {
					secondLargest = arr[i];  
					}
	        }
		System.out.println("Second largest value: " + secondLargest);
	    }
	}