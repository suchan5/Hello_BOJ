package day19;

import java.util.Scanner;

public class Boj27866_again {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next(); // sprout
        int num = scanner.nextInt(); // 3
        System.out.println(str.charAt(num-1)); // for 문으로 글자 하나하나 돌릴필요 없이 그냥 chatAt() 써서 index 에 바로 접근
    }
}
