package topicRelatedJava;

import java.util.Scanner;

public class TableofaNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		
		for(int i=0;i<=num;i++) {
			System.out.printf("%d * %d = %d \n", num,i,num*i);
	
		}

	}

}
