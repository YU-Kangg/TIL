package Bj2477_참외밭;

import java.util.Scanner;

public class Bj2477_0813 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int[] dir = new int[6];
        int[] len = new int[6];

        for (int i = 0; i < 6; i++) {
            dir[i] = sc.nextInt();
            len[i] = sc.nextInt();
        }

        int maxW = 0, idxW = -1;
        int maxH = 0, idxH = -1;

        for (int i = 0; i < 6; i++) {
            if (dir[i] == 1 || dir[i] == 2) {        // 동/서 → 가로
                if (len[i] > maxW) { maxW = len[i]; idxW = i; }
            } else {                                  // 남/북 → 세로
                if (len[i] > maxH) { maxH = len[i]; idxH = i; }
            }
        }

        int smallW = len[(idxW + 3) % 6];
        int smallH = len[(idxH + 3) % 6];

        int bigArea = maxW * maxH;
        int smallArea = smallW * smallH;
        int answer = (bigArea - smallArea) * k;

        System.out.println(answer);

    }
}
