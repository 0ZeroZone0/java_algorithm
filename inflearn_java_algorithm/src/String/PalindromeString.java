package String;

import java.util.Scanner;

public class PalindromeString {
	
	
	public String solution(String str) {
		String answer = "NO";
		
		String tmp = new StringBuilder(str).reverse().toString();
		if(str.equalsIgnoreCase(tmp)) {
			answer = "YES";
		}
		return answer;
	};	
	
	

	public static void main(String[] args) {
		PalindromeString P = new PalindromeString();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		System.out.println(P.solution(str));
	}

}
