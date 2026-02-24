package Bj2164_카드2;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Bj2164_0911 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Deque<Integer> dq = new ArrayDeque<>();
		int N = sc.nextInt();

		for (int i = N-1; i >= 0; i--) {
			dq.push(i+1);
		}
		
		while(dq.size() != 1) {
			dq.pop();
			dq.addLast(dq.pop());
		}
		
		System.out.println(dq.peek());
	}

}
