package practice;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter text one");
		String text1 = sc.nextLine();
		System.out.println("Enter text two");
		String text2 = sc.nextLine();
		text1=text1.toLowerCase();
		text2=text2.toLowerCase();
		if(text1.length() != text2.length()) {
			System.out.println("this is not anagram");
		}
		
		char [] arr1 = text1.toCharArray();
		char [] arr2 = text2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		if(Arrays.equals(arr1, arr2)) {
			System.out.println("this two string are anagram");
		} else {
			System.out.println("this two are not anagram");
		}
	}

}
