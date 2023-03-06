package Array;

import java.util.Scanner;

public class FibonacciNumber {

	public void solution(int n) {
		int a = 1, b = 1, c;
		System.out.println(a + " " + b + " ");
		for(int i =2; i < n; i++) {
			c = a+b;
			System.out.println(c + " ");
			a = b;
			b = c;
		}
	};

	public static void main(String[] args) {
		FibonacciNumber F = new FibonacciNumber();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		F.solution(n);
	};

};