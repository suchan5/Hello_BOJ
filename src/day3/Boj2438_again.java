package day3;

import java.util.Scanner;

public class Boj2438_again {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i=1; i<n+1; i++) { // n번의 반복이 일어나야함
            for (int j=0; j<i; j++) { // 1일때 1번 돌고, 2일때 2번 돌고, 3일때 3번 돌고
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
