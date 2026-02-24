package Swea21936;

import java.util.Scanner;

public class Swea21936_0811 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		for (int tc = 1; tc <= t; tc++) {
			int length = sc.nextInt();
			int search = sc.nextInt();
			String st = sc.next();

			boolean isOk = true;
			for (int i = 0; i <= length - search; i++) {
				String tmp = st.substring(i, i + search);
				StringBuilder sb = new StringBuilder(tmp);
				if (tmp.equals(sb.reverse().toString())) {
					isOk = false;
					System.out.println("#" + tc + " " + tmp);
				}
			}
			if (isOk) {
				System.out.println("#" + tc + " NONE");
			}

		}
	}
}