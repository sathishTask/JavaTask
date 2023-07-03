package javaProject;

public class OddNumbers {
	public static void main(String[] args) {
		int n1 = 100, n2 = 200;
		for (int i = 0; i <= n2; i++) {
			if (i > n1) {
				if (i % 2 != 0) {
					System.out.print(" " + i);
				}
			}
		}
	}
}