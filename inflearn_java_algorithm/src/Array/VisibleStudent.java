package Array;

import java.util.Scanner;

class VisibleStudent {

	public int solution(int n, int[] arr) {
		int answer = 1, max = arr[0];
		for(int i = 1; i < n; i++) {
			if(arr[i] > max) {
				answer++;
				max = arr[i];
			}
		}
		return answer;
	};

	public static void main(String[] args) {
		VisibleStudent V = new VisibleStudent();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}
		System.out.println(V.solution(n,arr));
	};

};