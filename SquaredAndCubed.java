package com.gc.squaredAndCubed;

import java.util.Scanner;

public class SquaredAndCubed {

	public static void main(String[] args) {
		System.out.println("Learn your Sqaured and Cubed Roots!");
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter an integer: ");
		int userNumber = input.nextInt();
		System.out.println(userNumber + " Selected");
		System.out.println("Number\t\t"+"Sqaured\t\t"+"Cubed\t\t");
		System.out.println("=======\t\t"+ "=======\t\t"+"======");
		for (int i = 0; i <= userNumber; i++) {
			
			System.out.println(i+"\t\t"+squared(i)+"\t\t"+cubed(i));
		}
		
		
		
input.close();
	}

	private static int squared(int userNumber) {
		int squared = userNumber * userNumber;
		return squared;
	}

	private static int cubed(int userNumber) {
		int numberCubed = userNumber*userNumber*userNumber;
		return numberCubed;
	}

}
