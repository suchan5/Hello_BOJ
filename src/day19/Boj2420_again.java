package day19;

import java.util.Scanner;

public class Boj2420_again {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong(); //  문제 보면 자료형의 표현 범위가 -2,000,000,000 < N,M > 2,000,000,000 으로 되어있다. int 로는 구현이 안됨. 그래서 long 을 써야함. 오~
        long M = scanner.nextLong();
        System.out.println(Math.abs(N-M));
    }
}
