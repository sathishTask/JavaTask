package javaProject;


// 0 1 2 3 5 6 7 8 9 
// 0 1 2 3 4 5 6 7 8 9
public class MissingNumber {
	public static void main(String[] args) {
		int a[] = { 1, 5, 3, 7, 8, 2, 6, 9, 0 };
		int sum = 0, total = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		System.out.println(sum);
		for (int j = 0; j < 10; j++) {
			total = total + j;
		}
		System.out.println(total);
		int missedNum = total - sum;
		System.out.println("Missed number is : " + missedNum);
	}
}