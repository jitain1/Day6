package com.bridgelabz.LogicalPrograms;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number");
		int num = sc.nextInt();
		sc.close();
		int reverse = 0;

		while (num != 0){
			int reminder = num % 10;
			reverse = reverse * 10 + reminder;
			num = num / 10;
		}
		System.out.println("Reverse Number are: " + reverse);

	}
}
