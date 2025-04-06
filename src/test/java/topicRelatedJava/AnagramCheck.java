package topicRelatedJava;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {
	//a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr input str1");
		String str1 = sc.nextLine();
		str1=str1.toLowerCase();
		
		
		System.out.println("Enetr input str2");
		String str2 = sc.nextLine();
		str2=str2.toLowerCase();
		if (str1.length() != str2.length()) {
			System.out.println("Not Anagram");
		}
		
		 char [] arr1 =str1.toCharArray();
		 char [] arr2 = str2.toCharArray();
		 
		 Arrays.sort(arr1);
		 Arrays.sort(arr2);
		 
		 if(Arrays.equals(arr1, arr2)) {
			 System.out.println("these are Anagram");
		 } else {
			 System.out.println("not Anagram");
		 }
		 

	}

}
