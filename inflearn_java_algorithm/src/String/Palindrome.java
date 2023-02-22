package String;

import java.util.Scanner;

public class Palindrome {

	public String solution(String s) {
		String answer = "NO";
		s = s.toUpperCase().replaceAll("[^A-Z]", "");
		String tmp = new StringBuilder(s).reverse().toString();
		if(s.equals(tmp)) {
			answer = "YES";
		}
		return answer;
	};	
	
	

	public static void main(String[] args) {
		Palindrome P = new Palindrome();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		System.out.println(P.solution(str));
	}

}
