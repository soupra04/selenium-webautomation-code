package topicRelatedJava;

import java.util.Scanner;

public class FactorialNumberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input");
		int num = sc.nextInt();

		// i = 1: factorial = 1 × 1 = 1

		// i = 2: factorial = 1 × 2 = 2

		// i = 3: factorial = 2 × 3 = 6

		// i = 4: factorial = 6 × 4 = 24

		// i = 5: factorial = 24 × 5 = 120

		int factorial = 1;

		for (int i = 1; i <= num; i++) {
			factorial *= i;

		}
		System.out.println("the factorial" + factorial);
	}

}
