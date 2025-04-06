package practice;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Input");
		int num = sc.nextInt();
		int a=0;
		int b=1;
		
		for(int i =0; i<=num;i++) {
			System.out.println(a + "");
			int next = a+b;
			a=b;
			b=next;
			
		}

	}

}
