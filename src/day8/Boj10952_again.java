package day8;

import java.util.Scanner;

public class Boj10952_again {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            while (true) { // 이 문제는 입력갑을 몇개 받겠다는 조건이 없으므로 일단 무한으로 반복해야한다.
                int A = scanner.nextInt();
                int B = scanner.nextInt();
                if (A==0 && B==0) { // 종료조건
                    break;
                }
                System.out.println(A+B);
            }
    }
}
