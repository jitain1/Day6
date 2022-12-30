package com.bridgelabz.LogicalPrograms;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("How many fibonaci number you want to be printed: ");
        int num = sc.nextInt();
        sc.close();
        
		int x=0, y=1;
		int nextnum;
		
		System.out.println("The fibonacci series is : ");
		
		if(num==1) {
			System.out.println(x);
		}
		else if(num==2) {
			System.out.println(x);
			System.out.println(y);
		}
		else {
			System.out.println(x);
			System.out.println(y);
			
			for(int i=1; i<=num-2; i++) {
				nextnum=x+y;
				System.out.println(""+ nextnum);
				x=y;
				y=nextnum;
			}
		}

	}

}
