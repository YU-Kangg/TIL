package Bj9663_NQueen;

import java.util.Scanner;

public class Bj9663_0909 {
    static int N;
    static int[] board; // board[i] = i행에 있는 퀸의 열 위치
    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        board = new int[N];
        solve(0);
        System.out.println(count);
    }

    static void solve(int row) {
        if (row == N) {
            count++;
            return;
        }

        for (int col = 0; col < N; col++) {
            board[row] = col;
            if (isSafe(row)) {
                solve(row + 1);
            }
        }
    }

    static boolean isSafe(int row) {
        for (int i = 0; i < row; i++) {
            // 같은 열이거나, 대각선에 있는 경우
            if (board[i] == board[row] || Math.abs(board[row] - board[i]) == row - i) {
                return false;
            }
        }
        return true;
    }
}
