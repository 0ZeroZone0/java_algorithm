package Array;

import java.util.Scanner;

class Rank {
	public int[] solution(int n, int[] arr) {
		int[] answer = new int[n];
		for(int i = 0; i < n; i++) {
			int cnt = 1;
			for(int j = 0; j < n; j++) {
				if(arr[j] > arr[i]) {
					cnt++;
				}
			}
			answer[i] = cnt;
		}
		return answer;
	};

	public static void main(String[] args) {
		Rank R = new Rank();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}
		for(int x : R.solution(n, arr)) {
			System.out.println(x +" ");
		}
	};

};