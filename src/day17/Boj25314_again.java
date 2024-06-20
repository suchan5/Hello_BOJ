package day17;

import java.util.Scanner;

public class Boj25314_again {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int repeat = N/4;
        for (int i=0; i<repeat; i++) {
            System.out.print("long ");
        }
        System.out.print("int");
    }
}
