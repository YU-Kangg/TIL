package Swea1215;

import java.util.Scanner;

public class Swea1215_0806 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int tc = 1; tc <= 10; tc++) {
			// 총 10번의 testcase 입력 받기
			int t = sc.nextInt();
			sc.nextLine();

			// 결과값 저장해둘 result 생성
			int result = 0;

			// 입력받을 String 배열 생성
			String[] arr = new String[8];

			// 8번 입력 받고 String 배열에 넣기
			for (int i = 0; i < 8; i++) {
				arr[i] = sc.nextLine();
			}

			// 회문 가로방향 탐색
			for (int i = 0; i < 8; i++) {
				for (int j = 0; j < 8 - t + 1; j++) {
					// j 부터 j+t만큼 문자열을 tmp에 저장
					String tmp = arr[i].substring(j, j + t);
					// reverse() 메서드 사용을 위해 StringBuilder 생성
					StringBuilder sb = new StringBuilder(tmp);
					// reverse된 값이랑 비교해서 같으면 result에 1더하기
					if (tmp.equals(sb.reverse().toString())) {
						result++;
					}
				}
			}

			// 회문 세로방향 탐색
			for (int i = 0; i < 8; i++) {
				for (int j = 0; j < 8 - t + 1; j++) {
					// append() 메서드 사용을 위해 StringBuilder 생성
					StringBuilder sb = new StringBuilder();
					for (int k = 0; k < t; k++) {
						//세로방향으로 String의 i번째에 있는 char끼리 조립
						sb.append(arr[j + k].charAt(i));
					}
					// tmp에 조립된 String 넣기
					String tmp = sb.toString();
					// reverse된 값이랑 비교해서 같으면 result에 1더하기
					if (tmp.equals(sb.reverse().toString())) {
						result++;
					}
				}
			}
			System.out.println("#" + tc + " " + result);
		}
	}
}
