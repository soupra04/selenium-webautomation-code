package topicRelatedJava;

import java.util.Scanner;

public class VowelConsonentCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr input str1");
		String text = sc.nextLine();
		
		int vowels =0;
		int consonent =0;
		String checkNumber = text.toLowerCase();
		
		for ( int i=0; i<=checkNumber.length()-1; i++) {
			char ch = checkNumber.charAt(i);
			if(Character.isLetter(ch)) {
				if (ch == 'a' || ch ==  'e' || ch=='i' || ch=='o' || ch== 'u') {
					vowels++;
				} else {
				consonent++;
			} 
				
			}
		}
System.out.println(vowels);
System.out.println(consonent);

	}

}
