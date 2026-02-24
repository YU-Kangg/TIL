package Bj12789_도키도키간식드리미;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;

public class Bj12789_0911 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		int N = sc.nextInt();
		Deque<Integer> deque = new ArrayDeque<>();
		int start = 1;

		for (int i = 0; i < N; i++) {
			int studentNum = sc.nextInt();

			if (studentNum != start) {
				deque.push(studentNum);
			} else if (studentNum == start) {
				start++;
			}
			
			while(!deque.isEmpty() && deque.peek() == start) {
				deque.pop();
				start++;
			}
		}

		System.out.println(start == N + 1 ? "Nice" : "Sad");
	}

}
