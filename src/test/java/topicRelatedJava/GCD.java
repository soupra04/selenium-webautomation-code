package topicRelatedJava;

import java.util.Scanner;

public class GCD {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number");
		int num1 = sc.nextInt();
		
		System.out.println("Please enter a number");
		int num2 = sc.nextInt();
		
		int gcd = GCD(num1,num2);
		System.out.println(gcd);
		
		
	}

	private static int GCD(int num1, int num2) {
		// TODO Auto-generated method stub
		while (num2!=0) {
			int temp = num2;
			num2 = num1 % num2;
			num1 = temp;
		}
		return Math.abs(num1);
	}

}
