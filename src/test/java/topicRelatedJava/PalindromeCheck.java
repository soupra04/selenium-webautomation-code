package topicRelatedJava;

import java.util.Scanner;

public class PalindromeCheck {
	//a word, phrase, or sequence that reads the same backwards as forwards, e.g. madam or nurses run.
	
	public static boolean isPalindrome(String text) {
		
		text = text.toLowerCase();
		int left = 0;
		int right= text.length()-1;
		
		while(left < right) {
			if (text.charAt(left) != text.charAt(right)) {
				return false; //not palindrome
			} 
			left++;
			right--;
		}
		return true; 
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new  Scanner(System.in);
		System.out.println("Enter input");
		String text = sc.nextLine();
		
		if(isPalindrome(text)) {
			System.out.println("This is Plaindrome");
		} else {
			System.out.println("this is not plaindrome");
		}

	}

}
