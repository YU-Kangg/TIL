package Bj2564_경비원;

import java.util.Scanner;

public class Bj2564_0811 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		int r = sc.nextInt();

		int shop = sc.nextInt();

		int[] nr = new int[shop];
		int[] nc = new int[shop];
		
		for (int i = 0; i < shop; i++) {
			nr[i] = sc.nextInt();
			nc[i] = sc.nextInt();

			if (nr[i] == 1) {
				nr[i] = 0;
			}else if (nr[i] == 2) {
				nr[i] = r;
			}else if (nr[i] == 3) {
				nr[i] = nc[i];
				nc[i] = 0;
			}else if (nr[i] == 4) {
				nr[i] = nc[i];
				nc[i] = c;
			}
		}
		int xnr = sc.nextInt();
		int xnc = sc.nextInt();

		if (xnr == 1) {
			xnr = 0;
		}else if (xnr == 2) {
			xnr = r;
		}else if (xnr == 3) {
			xnr = xnc;
			xnc = 0;
		}else if (xnr == 4) {
			xnr = xnc;
			xnc = c;
		}

		int result = 0;
		for (int i = 0; i < shop; i++) {
			if (Math.abs(nr[i] - xnr) == r) {
				result += Math.min(xnr + nr[i] + xnc + nc[i], r + c - xnc + c - nc[i]);
			} else if (Math.abs(nc[i]-xnc) == c) {
				result += Math.min(xnr + nr[i] + xnc + nc[i], c + r - nr[i] + r - xnr);
			} else {
				result += Math.abs(xnr - nr[i]) + Math.abs(xnc - nc[i]);
			}
		}
		System.out.println(result);
	}

}
