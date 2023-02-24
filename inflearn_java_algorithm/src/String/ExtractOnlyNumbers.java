package String;

import java.util.Scanner;

public class ExtractOnlyNumbers {

	public int solution(String s) {
		int answer = 0;
		for(char x : s.toCharArray()) {
			if(x >= 48 && x <= 57) {
				answer = answer * 10 + (x-48);
			}
		}
		return answer;
	}
	
	

	public static void main(String[] args) {
		ExtractOnlyNumbers E = new ExtractOnlyNumbers();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		System.out.println(E.solution(str));
	}

}