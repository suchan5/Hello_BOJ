package day18;

import java.util.Scanner;

public class Boj2738_again {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // 3
        int M = scanner.nextInt(); // 3
        int[][] A = new int[N][M];
        for (int i=0; i<N; i++) {
            for (int j=0; j<M; j++) {
                A[i][j] = scanner.nextInt();
            }
        }
        for (int i=0; i<N; i++) {
            for (int j=0; j<M; j++) {
                A[i][j] += scanner.nextInt(); // 두번째 array 받을때는 더해준다(출력값이 원하는게 더하는거임)
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }
}
