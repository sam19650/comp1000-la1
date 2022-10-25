package edu.wit.cs.comp1000;

import java.util.Scanner;

/**
 * Example solution to part a
 * 
 * @author derbinsky
 */
public class LA1a {

	/**
	 * Program execution point:
	 * input five numbers
	 * output sum, mean, population standard deviation
	 * 
	 * @param args command-line arguments (ignored)
	 */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("Enter five numbers: ");
		final double a = scanner.nextDouble();
		final double b = scanner.nextDouble();
		final double c = scanner.nextDouble();
		final double d = scanner.nextDouble();
		final double e = scanner.nextDouble();
		
		scanner.close();
		
		final double sum = (a + b + c + d + e);
		final double mean = (sum / 5.0);
		
		final double dA = (a - mean);
		final double dB = (b - mean);
		final double dC = (c - mean);
		final double dD = (d - mean);
		final double dE = (e - mean);
		
		final double stdDev = Math.sqrt((dA*dA + dB*dB + dC*dC + dD*dD + dE*dE) / 5.0);
		
		System.out.printf("Sum: %.2f%n", sum);
		System.out.printf("Mean: %.2f%n", mean);
		System.out.printf("Population Standard Deviation: %.2f%n", stdDev);
	}

}
