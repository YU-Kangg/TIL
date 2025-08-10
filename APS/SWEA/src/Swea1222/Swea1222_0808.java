package Swea1222;

import java.util.Scanner;
import java.util.Stack;

public class Swea1222_0808 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int tc = 1; tc <= 10; tc++) {
			int t = sc.nextInt();
			sc.nextLine();
			String st = sc.next();
			StringBuilder sb = new StringBuilder();
			Stack<Character> op = new Stack<>();
			Stack<Integer> stack = new Stack<>();
			
			for (int i = 0; i < t; i++) {
				char tmp = st.charAt(i);
				if (st.charAt(i) >= '0' && st.charAt(i) <= '9') {
					sb.append(tmp);
				} else {
					op.push(tmp);
				}
			}
			
			while (!op.isEmpty()) {
				sb.append(op.pop());
			}
			
			for(int i = 0; i<t; i++) {
				if(sb.charAt(i) >= '0' && sb.charAt(i)<='9') {
					stack.push(sb.charAt(i) - '0');
				} else {
					int B = stack.pop();
					int A = stack.pop();
					stack.push(A + B);
				}
			}
			
			System.out.println("#" + tc + " " + stack.pop());
		
		}
	}
}
