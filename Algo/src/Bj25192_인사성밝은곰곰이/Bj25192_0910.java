package Bj25192_인사성밝은곰곰이;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class Bj25192_0910 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();

		int result = 0;
		Set<String> set = new HashSet<>();
		Stack<String> stack = new Stack<>();
		
		for(int i = 0; i<T; i++) {
			stack.push(sc.next());
		}
		
		for(int i = 0; i<T; i++) {
			if(!(stack.peek().equals("ENTER"))) {
				set.add(stack.pop());
			} else {
				stack.pop();
				result += set.size();
				set.clear();
			}
		}
		
		System.out.println(result);
		
			
	}

}
