package Swea5432;

import java.util.Scanner;
import java.util.Stack;

public class Swea5432_0807 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();

		for (int tc = 1; tc <= t; tc++) {
			// String 입력 받기
			String st = sc.nextLine();

			// 결과값 저장해둘 result 생성
			int result = 0;

			// Stack 생성
			Stack<Character> stack = new Stack<>();

			// String 길이만큼 반복
			for (int i = 0; i < st.length(); i++) {
				// 꺼낸 char가 '('일때
				if (st.charAt(i) == '(') {
					// i+2가 인덱스를 넘치지 않으면서 String의 i+1번째가 ()인경우에는
					if (i + 2 < st.length() && st.substring(i, i + 2).equals("()")) {
						// result에 stack 크기만큼 더한다.
						result += stack.size();
						// st.charAt(i+1) 이 ')' 가 아니라면
					} else {
						// '(' 를 stack에 밀어넣는다.
						stack.push(st.charAt(i));
					}
				}
				// 꺼낸 char가 ')'이고 그 왼쪽이 '('가 아닐때(레이저가 아닐때)
				if (i - 1 >= 0 && st.charAt(i) == ')' && st.charAt(i - 1) != '(') {
					// stack에서 뽑아내고
					stack.pop();
					// 결과값에 1을 더한다
					result++;
				}
				// 꺼낸 char가 ')'이고 그 왼쪽이 '(' 라면 25번째줄에서 레이저로 이미 처리했기때문에 그냥 넘어감
			}
			System.out.println("#" + tc + " " + result);
		}
	}
}
