package Swea5356;

import java.util.Scanner;

public class Swea5356_0806 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int tc = sc.nextInt();
		sc.nextLine();

		for (int t = 1; t <= tc; t++) {
			// char 2차원배열 미리 생성
			char[][] cr = new char[5][15];
			for (int i = 0; i < 5; i++) {
				// 5번 입력 받아주고
				String st1 = sc.nextLine();
				// String을 char배열에 저장
				char[] c = st1.toCharArray();
				
				for (int j = 0; j < c.length; j++) {
				// char 2차원 배열에 값 저장
					cr[i][j] = c[j];
				}
			}
			
			System.out.print("#" + t + " ");
			
			//출력
			for (int i = 0; i < 15; i++) {
				for (int j = 0; j < 5; j++) {
					if (cr[j][i] != 0) {
						System.out.print(cr[j][i]);
					}
				}
			}
			System.out.println();
		}
	}

}
