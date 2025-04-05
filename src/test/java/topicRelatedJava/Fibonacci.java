package topicRelatedJava;

import java.util.Scanner;

public class Fibonacci {

	//0,0,1,1,2,3,5,8
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Num");
		int num = sc.nextInt();
		int a =0;
		int b =1;
		
		for(int i =0;i<=num;i++) {
			System.out.println(a + "");
			int next = a+b;
			a =b;
			b=next;
		}
	}

}
