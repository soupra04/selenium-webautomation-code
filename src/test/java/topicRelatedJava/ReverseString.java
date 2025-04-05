package topicRelatedJava;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a input");

		String text = scanner.nextLine();

		String reserved = "";

		for (int i = text.length() - 1; i >= 0; i--) {

			reserved += text.charAt(i); // text = abc; i =2 = c then i=1=b then i=0=a
		}
		System.out.println(reserved);
	}

}
