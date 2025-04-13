package topicRelatedJava;

import java.util.Scanner;

public class FindOddEvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number");
		int num = sc.nextInt();
		
		if(num%2==0) {
			System.out.println("This is Even Number");
		} else {
			System.out.println("This is not even number");
		}
		
		
	}

}
