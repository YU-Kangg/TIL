package Bj1244_스위치켜고끄기;

import java.util.Scanner;

public class Bj1244_0812 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 버튼 수
		int t = sc.nextInt();

		// 버튼 상태 배열
		int[] button = new int[t];
		for (int i = 0; i < t; i++) {
			button[i] = sc.nextInt();
		}

		// 버튼 상태 배열
		boolean[] status = new boolean[t];
		for (int i = 0; i < t; i++) {
			if (button[i] == 1) {
				status[i] = true;
			}
		}

		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int gender = sc.nextInt();
			int num = sc.nextInt();

			if (gender == 1) {
				for (int j = num; j <= t; j += num) {
					status[j - 1] = !status[j - 1];
				}
			} else if (gender == 2) {
				int left = num - 1;
				int right = num - 1;
				while (left - 1 >= 0 && right + 1 < t && status[left - 1] == status[right + 1]) {
					left--;
					right++;
				}
				for (int j = left; j <= right; j++) {
					status[j] = !status[j];
				}

			}
		}
		for (int i = 0; i < t; i++) {
			System.out.print((status[i] ? 1 : 0) + " ");
		}
	}
}
