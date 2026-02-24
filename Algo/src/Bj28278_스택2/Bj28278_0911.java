package Bj28278_스택2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;
import java.util.StringTokenizer;

public class Bj28278_0911 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Deque<Integer> deque = new ArrayDeque<>();
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int want = Integer.parseInt(st.nextToken());
			if(want == 1) {
				deque.push(Integer.parseInt(st.nextToken()));
			} else if(want == 2) {
				System.out.println(deque.isEmpty() ? -1 : deque.pop());
			} else if(want == 3) {
				System.out.println(deque.size());
			} else if(want == 4) {
				System.out.println(deque.isEmpty() ? 1 : 0);
			} else {
				System.out.println(deque.isEmpty() ? -1 : deque.peek());
			}
		}
	}

}
