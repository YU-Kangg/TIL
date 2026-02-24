package Bj1010_다리놓기;

import java.util.Scanner;

public class Bj1010_0909 {
	static int S, W;
	static int result = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int tc = 1; tc<=T; tc++) {
			S = sc.nextInt();
			W = sc.nextInt();
			comb(0,0);
			System.out.println(result);
		}
	}
	static void comb(int idx, int sidx) {
		if(idx == S) {
			result ++;
			return;
		}else {
			for(int i = sidx; i<W; i++) {
				comb(idx+1, i+1);
			}
		}
		
	}

}