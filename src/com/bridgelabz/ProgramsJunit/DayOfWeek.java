package com.bridgelabz.ProgramsJunit;

import java.util.Scanner;

public class DayOfWeek {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter date");
		int d = sc.nextInt();
		System.out.println("Enter month");
		int m = sc.nextInt();
		System.out.println("Enter year");
		int y = sc.nextInt();
		System.out.println();

		int y0 = y - (14 - m) / 12;
		int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
		int m0 = m + 12 * ((14 - m) / 12) - 2;
		int d0 = (d + x + 31 * m0 / 12) % 7;

		switch (d0) {
		case 0:
			System.out.println("sunday");
			break;
		case 1:
			System.out.println("monday");
			break;
		case 2:
			System.out.println("tuesday");
			break;
		case 3:
			System.out.println("wednesday");
			break;
		case 4:
			System.out.println("thurseday");
			break;
		case 5:
			System.out.println("friday");
			break;
		default:
			System.out.println("saturday");


		}
	}
}
