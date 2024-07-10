package day15;

import java.util.Scanner;

public class Boj11382_again {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long A = scanner.nextLong();
        long B = scanner.nextLong();
        long C = scanner.nextLong();
        System.out.println(A+B+C); // 런타임 에러난다. 자료형의 표현범위때문이다. 그래서 int 안쓰고 long 써야한다. 그걸 보는 문제임
    }
}
