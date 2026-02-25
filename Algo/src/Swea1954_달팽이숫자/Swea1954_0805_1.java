package Swea1954;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Swea1954_0805_1 {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("Swea/src/Swea1954/input (5).txt");

		Scanner sc = new Scanner(file);
//		Scanner sc = new Scanner(System.in);

		// 반시계 방향

		int t = sc.nextInt();
		for (int tc = 1; tc <= t; tc++) {
			int N = sc.nextInt();
			int[][] arr = new int[N][N];
			// N을 담을 K 만들기 (K의 개수를 유동적으로 쓰기 위해서?)
			int K = N;

			// 좌우 변수, 상하 변수 만들기
			// 좌우는 0부터 시작해야하니까 -1부터 만들기
			// 방향을 바꿔줄 변수도 필요할꺼같은데?
			int d = 1; // 더해주거나 빼주기 위해서 1로 두고 반대로 갈때는 -d로 하면 될듯
			int r = 0;
			int c = -1;
			// 시작 번호
			int num = 1;
			// for문 돌리기
			while (true) {
				for (int i = 0; i < K; i++) {
					c += d;
					arr[c][r] = num++;
				}
				K--;
				if (K == 0)
					break;
				for (int j = 0; j < K; j++) {
					r += d;
					arr[c][r] = num++;
				}
				d = -d;
			}
			System.out.println("#" + tc);
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}
		}
	}
}
