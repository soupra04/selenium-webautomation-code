package topicRelatedJava;

import java.util.Scanner;

public class CountofCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr input");
		String text = sc.nextLine();
		
		int count =0;
		for(int i=0; i<text.length();i++) {
			count++;
			
		}
		System.out.println(count);
	}

}
