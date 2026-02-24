package Bj1904_01타일;

import java.io.IOException;
import java.util.Scanner;

public class Bj1904_0912 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] fib = new long[Math.max(3, N+1)];
		
		fib[1] = 1;
		fib[2] = 2;
		for (int i = 3; i <= N; i++) {
			fib[i] = (fib[i - 1] + fib[i - 2]) % 15746;
		}
		System.out.println(fib[N]);
	}

}
