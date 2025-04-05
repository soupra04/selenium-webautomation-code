package topicRelatedJava;

import java.util.Scanner;

public class FindNonFirstRepeatedNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean found = false;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the String");
		String text = sc.nextLine();
		
		for ( int i=0;i<=text.length()-1;i++) {
			char ch = text.charAt(i);
			if(text.indexOf(ch) == text.lastIndexOf(ch)) {
				System.out.println("The first non repeated character" + " " + ch );
				found = true;
				break;
			}
		} if (!found)
		System.out.println("No non-repeating character found.");
	}

}
