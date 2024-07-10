package day20;

import java.util.Scanner;

public class Boj4101 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            long firstNum = scanner.nextLong();
            long secondNum = scanner.nextLong();
            if (firstNum == 0 && secondNum == 0) {
                break;
            }
            if (firstNum > secondNum) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
