package Bj15651_N과M3;

import java.util.Scanner;

public class Bj15651_0908 {
	static int N, M;
	static int[] result;
	static StringBuilder sb;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		result = new int[M];
		sb = new StringBuilder();
		dfs(0, 1);
		System.out.print(sb);
	}
	static void dfs(int idx, int sidx) {
		if(idx == M) {
			for(int i:result) {
				sb.append(i).append(" ");
			}
			sb.append("\n");
			return;
		}
		
		for(int i = sidx; i<=N; i++) {
			result[idx] = i;
			dfs(idx+1, sidx);
		}
		
		
	}
}
