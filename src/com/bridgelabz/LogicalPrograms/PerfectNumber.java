package com.bridgelabz.LogicalPrograms;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);

		System.out.println("Enter the number: ");
		int number= sc.nextInt();
		sc.close();
		
		int sum=0;
		int num=number;
		for (int i=1; i<num-1; i++) {
			if(num%i==0) {
				sum=sum+i;
			}
		}	
		if(sum==number) {
			System.out.println("The number is a Perfect Number");
		}else
			System.out.println("The number is not a Perfect Number");

	}

}
