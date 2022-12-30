package com.bridgelabz.LogicalPrograms;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int number = sc.nextInt();

        boolean prime = true;

        if(number < 2)
        {
            prime = false;
        }
        else
        {
            for(int i=2; i <= number/2; i++)
            {
                if(number % i == 0)
                {
                    prime = false;
                    break;
                }
            }
        }
        String check = prime ? "is a Prime number" : "is not a Prime number";
        System.out.println(number + " " + check);
	}
}
