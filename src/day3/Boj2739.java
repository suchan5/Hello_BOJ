package day3;

import java.util.Scanner;

public class Boj2739 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dan = scanner.nextInt();
        for (int i=1; i< 10 ; i++) {
            System.out.println(dan + " * " + i + " = " + dan*i);
        }
    }
}
