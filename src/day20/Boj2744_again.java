package day20;

import java.util.Scanner;

public class Boj2744_again {
    public static void main(String[] args) {
        // 아스키 코드를
        System.out.println((int) 'A'); // 65
        System.out.println((int) 'B'); // 66
        System.out.println((int) 'C'); // 67
        System.out.println((int) 'D'); // 68
        System.out.println((int) 'a'); // 97
        System.out.println((int) 'b'); // 98
        System.out.println((int) 'c'); // 99
        System.out.println((int) 'd'); // 100
        System.out.println("---------------------------------------------------");  // 대문자와 소문자의 차이는 32. 이걸 이용해서 대문자는 소문자로, 소문자는 대문자로 바꿔줄꺼다.


        Scanner scanner = new Scanner(System.in);
        char[] text = scanner.nextLine().toCharArray(); // e.g. WrongAnswer 입력을 'String text = scanner.nextLine(); 로 받지않고 char[]로 받았다
        for (int i=0; i<text.length; i++) {
            char temp = text[i];
            if (temp >= 'a' && temp <= 'z') {
                System.out.print((char) (temp-32));
            } else {
                System.out.print((char) (temp+32));
            }
        }
    }
}