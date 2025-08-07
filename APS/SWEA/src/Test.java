import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("./src/input.txt");
		Scanner sc = new Scanner(file);
		int T = sc.nextInt();
		
		for (int tc = 1; tc <= T; tc++) {

			int N = sc.nextInt();
			int[][] arr = new int[N][N];

			for (int r = 0; r < N; r++) {
				for (int c = 0; c < N; c++) {
					arr[r][c] = sc.nextInt();
				}
				System.out.println(Arrays.toString(arr[r]));
			}
			
		}
		
		
	}
}
