package day15;

import java.util.Scanner;

public class Boj2475 {
    public static void main(String[] args) {
        // 6자리 고유번호
        // x00000~x99999
        // 검증수 = 0^2 + 4^2 + 2^2 + 5^2 + 6^2 = (0 + 16 + 4 + 25 + 36 ) % 10 = 1
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i=0; i<5; i++) {
            int num = scanner.nextInt();
            num = num*num;
            sum += num;
        }
        int answer = sum % 10;
        System.out.println(answer);
    }
}
