package Bj4949_균형잡힌세상;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Bj4949_0911 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			Deque<Character> deque = new ArrayDeque<>();
			String st = sc.nextLine();
			if (st.equals(".")) {
				return;
			}
			int N = st.length();
			boolean isOk = true;
			for (int i = 0; i < N; i++) {
				char c = st.charAt(i);
				if (c == '(' || c == '[') {
					deque.push(c);
				} else if (c == ')') {
					if (deque.isEmpty() || deque.pop() != '(') {
						isOk = false;
						break;
					}
				} else if (c == ']') {
					if (deque.isEmpty() || deque.pop() != '[') {
						isOk = false;
						break;
					}
				}
			}
			
			if(!deque.isEmpty()) {
				isOk = false;
			}
			System.out.println(isOk ? "yes" : "no");
		}
	}

}
