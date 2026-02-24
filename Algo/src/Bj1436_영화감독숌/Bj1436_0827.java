package Bj1436_영화감독숌;

import java.util.Scanner;

public class Bj1436_0827 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int count = 0;
		int d = 666;
		
		while (true) {
			if(String.valueOf(d).contains("666")) {
				count++;
				if(count == num) {
					System.out.println(d);
					break;
				}
			}
			d++;
		}
	}
}