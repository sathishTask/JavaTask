package javaProject;
public class FibonacciSeries {
	public static void main(String[] args) {
		int n1 = 0, n2 = 1, sum = 0;
		System.out.print("Fibonacci Series are : " + n1 + " " + n2);
		for (int i = 0; i <= 100; i++) {
			if (sum < 100) {
				sum = n1 + n2;
				n1 = n2;
				n2 = sum;
				if (sum > 100) {
					break;
				} else {
					System.out.print(" " + sum);
				}
			}
		}
	}
}