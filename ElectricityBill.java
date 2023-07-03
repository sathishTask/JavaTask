package javaProject;

import java.util.Scanner;

public class ElectricityBill {
	public static void main(String[] args) {
		double bill = 0, tax = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of units consumed: ");
		int units = sc.nextInt();
		if (units < 50) {
			System.out.println("Your electricity bill is Rs." + bill);
		} else if (50 <= units && units < 100) {
			bill = units * 0.5;
			System.out.println("Your electricity bill is Rs." + bill);
		} else if (100 <= units && units < 250) {
			bill = units * 1;
			System.out.println("Your electricity bill is Rs." + bill);
		} else if (250 >= units) {
			bill = units * 1.5;
			System.out.println("Your electricity bill is Rs." + bill);
		}
		tax = bill * 0.2;
		System.out.println("Tax charges Rs." + tax);
		bill = bill + tax;
		System.out.println("Electricity bill including tax Rs." + bill);
	}
}