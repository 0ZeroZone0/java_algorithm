package String;

import java.util.Scanner;

class FindText {
	
	public int solution(String str,char t) {
		int answer = 0;
		str = str.toUpperCase();
		t = Character.toUpperCase(t);
		System.out.println("str ::" + str);
		
		/*
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)==t) answer++;
		}
		*/
		
		for(char x : str.toCharArray()) {
			if(x==t) answer++;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		FindText T = new FindText();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		char c = str.charAt(0);
		System.out.println(T.solution(str, c));
		
		
	}

}
