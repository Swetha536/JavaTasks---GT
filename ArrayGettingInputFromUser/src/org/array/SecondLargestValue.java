package org.array;
import java.util.Scanner;

public class SecondLargestValue {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		int m1=arr[0];
		for(int i=1;i<n;i++) {
			if(arr[i]>m1) {
				m1=arr[i];
			}
			
		}
		int m2=arr[0];
		for(int i=1;i<n;i++) {
			if(arr[i]!=m1) {
				if(arr[i]>m2) {
					m2=arr[i];
				}
			}
	
		}
		System.out.println(m2);
	}

}