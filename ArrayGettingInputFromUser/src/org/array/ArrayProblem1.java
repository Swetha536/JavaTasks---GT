package org.array;

public class ArrayProblem1 {
	public static void main(String[] args) {
//		int a[]=new int[5];
//		a[0]=10;
//		a[1]=20;
//		a[2]=30;
//		a[3]=40;
//		a[4]=50;
//		for (int i=0;i<a.length;i++) {
//			System.out.println(a[i]);
//		}
//		
//	}
		//Nested for loop
		
//		int a[]=new int[10];
//		a[0]=20;
//		a[1]=10;
//		a[2]=90;
//		a[3]=80;
//		a[4]=60;
//		a[5]=10;
//		a[6]=50;
//		a[7]=40;
//		a[8]=70;
//		a[9]=30;
//		for (int i=0;i<=4;i++) {
//		for(int j=0;j<a.length;j++) {
//			System.out.println(j);
//		}
//	}
//	}
		//enhanced for loop
//		for (int b:a) {
//			System.out.println(b);
//		}
//		}
		//enhanced nested for loop
		int a[][]=new int[2][2];
		a[0][0]=20;
		a[0][1]=30;
		a[1][0]=40;
		a[1][1]=50;
		for(int[]b:a) {
			for(int c:b) {
				System.out.println(c);
			}
		}
	}
}
	 
		
