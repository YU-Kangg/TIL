package Swea1218;

import java.util.Scanner;
import java.util.Stack;

public class Swea1218_0807 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int tc = 1; tc <= 10; tc++) {
			int t = sc.nextInt();
			sc.nextLine();
			String st = sc.nextLine();
			
			Stack<Character> stack1 = new Stack<>();
			Stack<Character> stack2 = new Stack<>();
			Stack<Character> stack3 = new Stack<>();
			Stack<Character> stack4 = new Stack<>();
			
			boolean isOk = true;
			
			for (int i = 0; i < t; i++) {
				if (t % 2 != 0) {
					isOk = false;
					break;
				}
				if (st.charAt(i) == '(') {
					stack1.push(st.charAt(i));
				} else if (st.charAt(i) == '{') {
					stack2.push(st.charAt(i));
				} else if (st.charAt(i) == '[') {
					stack3.push(st.charAt(i));
				} else if (st.charAt(i) == '<') {
					stack4.push(st.charAt(i));
				} else if (st.charAt(i) == ')') {
					if (stack1.isEmpty()) {
						isOk = false;
						break;
					}
					stack1.pop();
				} else if (st.charAt(i) == '}') {
					if (stack2.isEmpty()) {
						isOk = false;
						break;
					}
					stack2.pop();
				} else if (st.charAt(i) == ']') {
					if (stack3.isEmpty()) {
						isOk = false;
						break;
					}
					stack3.pop();
				} else if (st.charAt(i) == '>') {
					if (stack4.isEmpty()) {
						isOk = false;
						break;
					}
					stack4.pop();
				}
			}
			System.out.println("#" + tc + " " + (isOk ? 1 : 0));
		}
	}
}
