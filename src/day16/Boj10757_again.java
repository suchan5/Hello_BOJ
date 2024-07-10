package day16;

import java.math.BigInteger;
import java.util.Scanner;

public class Boj10757_again {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 자료형 int, long 으로 해결이 안되는 데이터 범위. BigInt 를 쓰라
        BigInteger A = scanner.nextBigInteger();
        BigInteger B = scanner.nextBigInteger();
        System.out.println(A.add(B));
    }
}