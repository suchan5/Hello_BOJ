package day9;

import java.util.Scanner;

public class Boj10951_again {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) { // 이번에는 문제에 언제 종료하라고 조건이 주어진게 없다. 그럴때 스캐너는 이렇게 종료하면 됨
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            System.out.println(A+B);
        }
    }
}
