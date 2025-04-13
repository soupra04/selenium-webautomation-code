package topicRelatedJava;

import java.util.Scanner;

public class CountsDisgitOfaNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int count=0;
		
		int temp = Math.abs(num);
		
		if ( temp==0) {
			count=1;
		} else {
			while (temp>0) {
				temp = temp /10;
				count++;
			}
			
		}
		System.out.println(count);
	}

}
