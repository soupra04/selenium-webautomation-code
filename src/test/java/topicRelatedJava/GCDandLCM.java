package topicRelatedJava;

import java.util.Scanner;

public class GCDandLCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number 1");
		int smll = sc.nextInt();
		System.out.println("enter number 2");
		int larg = sc.nextInt();
		
		int gsd = findGSD(larg, smll);
		int lcd = ( larg * smll) / gsd;
		
		System.out.println("This is the result of gsd"+ gsd);
		System.out.println("This is the result of lcd"+ lcd);
		
				
				
				

	}
	public static int findGSD(int a , int b) {
		
		while (b !=0) {
			int temp = b;
			b = a % b;
			a =temp;
			
			
		}
		return Math.abs(a);
		
	}

}
