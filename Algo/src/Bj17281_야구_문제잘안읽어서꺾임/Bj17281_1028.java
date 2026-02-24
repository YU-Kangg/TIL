package Bj17281_야구_문제잘안읽어서꺾임;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Bj17281_1028 {
	static int T;
	static int[] arr;
	static Deque<Integer> baseStatus;
	static int count;
	static int outCount;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			arr = new int[9];
			for (int i = 0; i < 9; i++) {
				arr[i] = sc.nextInt();
			}
		}
		count = 0;
		outCount = 0;
		baseStatus = new ArrayDeque<>();
		clearBase();
	}

	static void dfs(int idx, int tmp) {
		if (idx > T) {
			Math.max(count, tmp);
			return;
		}
		while(outCount != 3) {
			for(int i = 0; i<9; i++) {
			}
		}
		if (outCount == 3) {
			clearBase();
			outCount = 0;
			dfs(idx + 1, tmp);
		}

	}

	static int status(int result) {
		switch (result) {
		case 0:
			outCount++;
			return 0;
		case 1:
			baseStatus.addLast(1);
			return homeCheck(result);
		case 2:
			baseStatus.addLast(1);
			baseStatus.addLast(0);
			return homeCheck(result);
		case 3:
			baseStatus.addLast(1);
			baseStatus.addLast(0);
			baseStatus.addLast(0);
			return homeCheck(result);
		case 4:
			int count = homeCheck(result) + 1;
			clearBase();
			return count;
		}
		return -1;
	}

	static void clearBase() {
		baseStatus.clear();
		for (int i = 0; i < 4; i++) {
			baseStatus.addLast(0);
		}
	}

	static int homeCheck(int result) {
		int count = 0;
		for (int i = 0; i < result; i++) {
			if (baseStatus.pollFirst() == 1) {
				count++;
			}
		}
		return count;
	}
}
