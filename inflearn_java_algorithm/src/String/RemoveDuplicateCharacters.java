package String;

import java.util.Scanner;

class RemoveDuplicateCharacters {
	
	public String solution(String str) {
		String answer = "";
		
		for(int i=0; i<str.length(); i++) {
			//System.out.println(str.charAt(i) + " " + i + " " + str.indexOf(str.charAt(i)));
			if(str.indexOf(str.charAt(i))==i) {
				answer += str.charAt(i);
			};
		};
		return answer;
	};

	public static void main(String[] args) {
		RemoveDuplicateCharacters r = new RemoveDuplicateCharacters();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		System.out.println(r.solution(str));
	};

};
