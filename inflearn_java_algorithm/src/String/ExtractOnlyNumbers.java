package String;

import java.util.Scanner;

public class ExtractOnlyNumbers {

	public int solution(String s) {
		String answer = "";
		for(char x : s.toCharArray()) {
			if(Character.isDigit(x)) {
				answer += x;
			}
		}
		return Integer.parseInt(answer);
	}
	
	

	public static void main(String[] args) {
		ExtractOnlyNumbers E = new ExtractOnlyNumbers();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		System.out.println(E.solution(str));
	}

}