package topicRelatedJava;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number");
		int num = sc.nextInt();
		boolean isPrime = true;
		
		if (num<=1) {
			isPrime = false;
		} else {
			for(int i=2; i<=Math.sqrt(num);i++) {
				if(num%i==0) {
					isPrime = false;
					break;
				}
			}
		}
		if(isPrime==false) {
			System.out.println("its not prime");
		} else {
			System.out.println("its prime");
		}
		
	}
}