package Bj14696_딱지놀이;

import java.util.Scanner;

public class Bj14696_GPT{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int tc = 0; tc < t; tc++) {
            int[] A = new int[5]; // 1~4 도형 카운트
            int[] B = new int[5];

            int Acount = sc.nextInt();
            for (int i = 0; i < Acount; i++) {
                A[sc.nextInt()]++;
            }

            int Bcount = sc.nextInt();
            for (int i = 0; i < Bcount; i++) {
                B[sc.nextInt()]++;
            }

            // 별(4)부터 삼각형(1)까지 비교
            char winner = 'D';
            for (int shape = 4; shape >= 1; shape--) {
                if (A[shape] > B[shape]) {
                    winner = 'A';
                    break;
                } else if (A[shape] < B[shape]) {
                    winner = 'B';
                    break;
                }
            }

            System.out.println(winner);
        }

        sc.close();
    }
}
