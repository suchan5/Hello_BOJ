package day13;

import java.util.Scanner;

public class Boj3003 {
    public static void main(String[] args) {
        // 총 16 피스 : [1, 1, 2, 2, 2, 8]
        // 킹:1
        // 퀸:1
        // 룩:2
        // 비숍: 2
        // 나이트 2
        // 폰: 8
        int[] original = {1, 1, 2, 2, 2, 8};
        Scanner scanner = new Scanner(System.in);
        int[] diff = new int[6];
        for (int i=0; i<6; i++) {
            int pieces = scanner.nextInt();
            if (pieces != original[i]) {
                diff[i] = original[i] - pieces;
            } else {
                diff[i] = 0;
            }
        }
        for (int x : diff) {
            System.out.print(x + " ");
        }
    }
}