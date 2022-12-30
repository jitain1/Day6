package com.bridgelabz.ProgramsJunit;

import java.util.Scanner;

public class TemperatureCoversion {

			static void cToF(int temp) {
				//(°C × 9/5) + 32 = °F
				double temperatur = (temp * 9 / 5) + 32;
				System.out.println(temp + "C = " + temperatur + "F");
			}
			static void FToC(int temp) {
				//(°F − 32) x 5/9 = °C
				double temperatur = (temp -32) * 5 / 9;
				System.out.println(temp + "F = " + temperatur +"C");
			}

			public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				
				System.out.println("For celcius to fahrenheit conversion, PRESS 1");
				System.out.println("For fahrenheit to celcius conversion, PRESS 2");
				int choice = sc.nextInt();
				
				System.out.println("Enter the temperatur to convert : ");
				int temperatur = sc.nextInt();
				
				switch (choice) {
				case 1: {
					cToF(temperatur);
					break;
				}
				case 2: {
					FToC(temperatur);
					break;
				}
				default:
					System.out.println("Wrong option selected!!! There are only two option present.");
				}


	}

}
