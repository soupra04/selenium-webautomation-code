/**
 * 
 */
package topicRelatedJava;

import java.util.Scanner;

/**
 * 
 */
public class Fibonaci {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number");
		int num = sc.nextInt();
		
		int a =0;
		int b=1;
		
		for (int i=0;i<num;i++) {
			System.out.println(a + "");
			int sum = a +b;
			a=b;
			b=sum;
		}
	}

}
