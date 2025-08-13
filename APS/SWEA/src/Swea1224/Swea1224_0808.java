package Swea1224;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class Swea1224_0808 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int tc = 1; tc <= 10; tc++) {
			int t = sc.nextInt();
			String st = sc.next();

			StringBuilder sb = new StringBuilder();
			Stack<Character> op = new Stack<>();
			Stack<Integer> stack = new Stack<>();
			Map<Character, Integer> map = new HashMap<>();

			map.put('*', 2);
			map.put('/', 2);
			map.put('+', 1);
			map.put('-', 1);
			map.put('(', 0);

			for (int i = 0; i < t; i++) {
				char tmp = st.charAt(i);
				if (tmp >= '0' && tmp <= '9') {
					sb.append(tmp);
				} else if (tmp == '(') {
					op.push(tmp);
				} else if (tmp == ')') {
					while (op.peek() != '(') {
						sb.append(op.pop());
					}
					op.pop();
				} else if (op.isEmpty()) {
					op.push(tmp);
				} else {
					while (map.get(op.peek()) >= map.get(tmp) && !op.isEmpty()) {
						sb.append(op.pop());
					}
					op.push(tmp);
				}
			}
			while (!op.isEmpty()) {
				sb.append(op.pop());
			}
//			System.out.println(sb);
			
			
			for (int i = 0; i < sb.length(); i++) {
				char tmp = sb.charAt(i);
				if (tmp >= '0' && tmp <= '9') {
					stack.push(tmp - '0');
				} else {
					int B = stack.pop();
					int A = stack.pop();

					switch (tmp) {
					case ('+'):
						stack.push(A + B);
					break;
					case ('-'):
						stack.push(A - B);
					break;
					case ('*'):
						stack.push(A * B);
					break;
					case ('/'):
						stack.push(A / B);
					break;
					}
				}
			}

			System.out.println(stack.pop());

		}
	}

}

//////////////////////
