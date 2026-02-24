package Swea1989;

import java.util.Scanner;

public class Swea1989_0806 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		
		for (int tc = 1; tc <= t; tc++) {
			String st = sc.nextLine().trim();
			StringBuilder sb = new StringBuilder(st);
			System.out.println("#" + tc + " " + (st.equals(sb.reverse().toString()) ? 1 : 0));
		}
	}
}
