package String;

import java.util.Scanner;

class CaseConversion {

	public String solution(String str) {
		String answer = "";
		for(char x : str.toCharArray()) {
			/*
			if(Character.isLowerCase(x)) answer += Character.toUpperCase(x);
			else answer += Character.toLowerCase(x);
		    */
			
			if(x>=97 && x<=122) answer += (char)(x-32);
			else answer += (char)(x+32);
			
		}
			return answer;
	}	
	
	
	
	public static void main(String[] args) {

		CaseConversion C = new CaseConversion();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.print(C.solution(str));
		
	}

}
