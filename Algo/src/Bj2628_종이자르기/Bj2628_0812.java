package Bj2628_종이자르기;

import java.util.Scanner;

public class Bj2628_0812 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int r = sc.nextInt();
		int c = sc.nextInt();
		int cut = sc.nextInt();
		int x = r;
		int y = c;
		for (int i = 0; i < cut; i++) {
			int p = sc.nextInt();
			int leng = sc.nextInt();
			if (p == 0) {
				if (x > c - leng) {
					x = c - leng;
				}
			}
			if (p == 1) {
				if (y > r - leng) {
					y = r - leng;
				}
			}
		}
		System.out.println(x*y);
	}
}
