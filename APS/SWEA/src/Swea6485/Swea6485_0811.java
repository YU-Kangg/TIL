package Swea6485;

import java.util.Scanner;

public class Swea6485_0811 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//테스트 케이스 수 입력
		int t = sc.nextInt();
		for (int tc = 1; tc <= t; tc++) {
			int N = sc.nextInt();
			
			//시작과 끝 배열을 따로 생성해서 넣기
			int[] start = new int[N];
			int[] end = new int[N];
			for (int i = 0; i < N; i++) {
				start[i] = sc.nextInt();
				end[i] = sc.nextInt();
			}
			
			//정류장 개수 입력
			int total = sc.nextInt();
			
			int[] result = new int[total];
			for (int i = 0; i < total; i++) {
				int busStop = sc.nextInt();
				
				//정류장이 시작지점과 끝지점 사이에 있으면 result에 +1
				for (int j = 0; j < N; j++) {
					if (busStop >= start[j] && busStop <= end[j]) {
						result[i]++;
					}
				}
			}
			
			//출력
			System.out.print("#" + tc + " ");
			for (int i = 0; i < total; i++) {
				System.out.print(result[i] + " ");
			}
			System.out.println();
		}
	}
}