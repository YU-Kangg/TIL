package Swea1216;

import java.util.Scanner;

public class Swea1216_0807 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int tc = 1; tc <= 10; tc++) {
			int t = sc.nextInt();
			sc.nextLine();
			int result = 0;
			int N = 100;
			char[][] arr = new char[100][100];
			for (int i = 0; i < N; i++) {
				String st = sc.nextLine();
				for (int j = 0; j < N; j++) {
					arr[i][j] = st.charAt(i);
				}
			}
			
			//가로열
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					int[] jToK = new int[N];
					int jToKCount = 0;
					for (int k = 0; k < N-j; k++) {
						if (arr[i][j] == arr[i][k]) {
							jToK[jToKCount++] = k - j;
						}
					}
					StringBuilder sb = new StringBuilder();
					for (int m = 0; m < jToK[j]; m++) {
						sb.append(arr[j + jToK[j]]);
					}
					String st = sb.toString();
					if (st.equals(sb.reverse().toString())) {
						if(result < jToK[j]) {
							result = jToK[j];
						}
					}
				}
			}
			System.out.println(result);

		}

	}

}
