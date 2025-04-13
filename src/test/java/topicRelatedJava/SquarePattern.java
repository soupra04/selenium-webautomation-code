package topicRelatedJava;

import java.util.Scanner;

public class SquarePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {

			for (int j = 0; j < num; j++) {
				System.out.print("* ");
			}
			System.out.println();

		}

	}

}
