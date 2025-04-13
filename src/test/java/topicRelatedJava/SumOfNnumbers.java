package topicRelatedJava;

import java.util.Scanner;

public class SumOfNnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number");
		int num = sc.nextInt();
		int sum = 0;
		for (int i = 0; i <= num; i++) {
			System.out.println(i);
			 sum = sum +i;
		}
		System.out.println("total summation is"+sum);

	}

}
