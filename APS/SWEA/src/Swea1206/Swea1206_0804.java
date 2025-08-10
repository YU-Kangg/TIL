package Swea1206;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Swea1206_0804 {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("./src/Swea1206/sample_input.txt");

		Scanner sc = new Scanner(file);
//		Scanner sc = new Scanner(System.in);
 
		// 총 10개의 테스트 케이스
		for (int k = 1; k <= 10; k++) {
			// 결과값을 저장할 result 초기화
			int result = 0;

			// 각 10번만큼 입력받기
			int tc = sc.nextInt();
			int[] building = new int[tc];
			for (int i = 0; i < tc; i++) {
				building[i] = sc.nextInt();
			}

			// 대상빌딩 주변 2칸까지 최대값 찾기
			for (int i = 2; i < tc - 2; i++) {
				int tmp = 0;
				
				if (building[i + 1] >= building[i + 2]) {
					tmp = building[i + 1];
				} else if (building[i + 1] <= building[i + 2]) {
					tmp = building[i + 2];
				}
				
				if (tmp <= building[i - 1]) {
					tmp = building[i - 1];
				}
				if (tmp <= building[i - 2]) {
					tmp = building[i - 2];
				}
				
				if (building[i] - tmp <= 0) {
					tmp = building[i];
				}
				
				result += building[i] - tmp;
				
			}
			System.out.printf("#%d %d \n", k, result);
		}
	}
}