package day17;

import java.util.Scanner;

public class Boj9086_again {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for (int i=0; i<N; i++) {
            String input = scanner.next();
            System.out.print(input.charAt(0));
            System.out.println(input.charAt(input.length()-1)); // String 의 맨 마지막 글자를 프린트하고 싶으면 이렇게 length 를 활용
        }
    }
}
