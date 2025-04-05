package practice;

import java.util.Scanner;

public class VowelCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Input");
		String text = sc.nextLine();
		int vowel = 0;
		int consonent = 0;

		for (int i = 0; i < text.length(); i++) {
			char ch = text.charAt(i);
			if (Character.isLetter(ch)) {
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					vowel++;
				} else {
					consonent++;
				}
			}
		}
		System.out.println("Count of vowel" + vowel);
		System.out.println("Count of consonent" + consonent);

	}

}
