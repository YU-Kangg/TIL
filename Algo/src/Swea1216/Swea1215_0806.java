package Swea1216;

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
			String[] arr = new String[100];

			// 100번 입력 받고 String 배열에 넣기
			for (int i = 0; i < 100; i++) {
				arr[i] = sc.nextLine();
			}
			// 가로검사
			for (int len = 100; len >= 1; len--) {
				for (int i = 0; i < 100; i++) {
					for (int j = 0; j <= 100 - len; j++) {
						//substring 활용해서 j -> j + len까지 String 생성
						String tmp = arr[i].substring(j, j + len);
						//reverse쓸꺼니깐 StringBuilder 생성
						StringBuilder sb = new StringBuilder(tmp);
						//reverse된거랑 비교해서 같으면서
						if (tmp.equals(sb.reverse().toString())) {
							//result랑 비교해서 크면
							if (result < len) {
								//대입
								result = len;
								break;
							}
						}
					}
				}
			}

			// 세로검사
			for (int len = 100; len >= 1; len--) {
				for (int i = 0; i < 100; i++) {
					for (int j = 0; j <= 100 - len; j++) {
						// append() 메서드 사용을 위해 StringBuilder 생성
						StringBuilder sb = new StringBuilder();
						for (int k = 0; k < len; k++) {
							// 세로방향으로 String의 i번째에 있는 char끼리 조립
							sb.append(arr[j + k].charAt(i));
						}
						// tmp에 조립된 String 넣기
						String tmp = sb.toString();
						// reverse된 값이랑 비교해서 같으면서
						if (tmp.equals(sb.reverse().toString())) {
							//result 랑 비교해보고 len이 크면
							if (result < len) {
								//대입
								result = len;
							}
						}
					}
				}
			}

			System.out.println("#" + t + " " + result);
		}
	}
}