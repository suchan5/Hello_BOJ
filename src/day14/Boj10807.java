package day14;

import java.util.Scanner;

public class Boj10807 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] numArr = new int[N];
        for (int i=0; i<N; i++) {
            int num = scanner.nextInt();
            numArr[i] = num;
        }
        int v = scanner.nextInt();

        int answer = 0;
        for (int i=0; i<numArr.length; i++) {
            if (numArr[i] == v) {
                answer++;
            }
        }
        System.out.println(answer);
    }
}