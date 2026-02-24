package Bj2669_직사각형면적구하기;

import java.util.Scanner;

public class Bj2669_0812 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int total = 0;
		for(int tc =0; tc<4; tc++) {
			int leftX = sc.nextInt();
			int leftY = sc.nextInt();
			int rightX = sc.nextInt();
			int rightY = sc.nextInt();
			total += (rightX - leftX) * (rightY - leftY);
		}
		
		int[][] max = new int[100][100];
		
		
		System.out.println(total);
	}

}
