package Bj9012_괄호;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj9012_0911 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		for (int tc = 0; tc < T; tc++) {
			String st = br.readLine();
			int N = st.length();
			int count = 0;
			for (int i = 0; i < N; i++) {
				if (st.charAt(i) == '(') {
					count++;
				} else {
					count--;
				}
				if (count < 0) {
					break;
				}
			}
			System.out.println(count == 0 ? "YES" : "NO");
		}
	}

}
