package day11;

import java.util.Scanner;

public class Boj10872_again {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int answer = 1;
        for (int i=N; i>0; i--) {  // e.g. 5! = 5x4x3x2x1 = 120
            answer *= i;
        }
        System.out.println(answer);
    }
}