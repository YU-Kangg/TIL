import java.util.Scanner;

public class Algo1_서울_13_강영욱 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for (int tc = 1; tc <= t; tc++) {
			String a = sc.next();
			int result = 1;

			for (int i = 0; i < a.length(); i++) {
				if (i < a.length() -1 &&
					(a.charAt(i) == a.charAt(i + 1) ||
					a.charAt(i) == a.charAt(i + 1) - 32||
					a.charAt(i) == a.charAt(i + 1) + 32)) {
					result++;
				} else {
					System.out.print(a.charAt(i) + "" + result);
					result = 1;
				}
			}
			System.out.println();
		}
	}
}
