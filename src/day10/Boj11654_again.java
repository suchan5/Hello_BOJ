package day10;

import java.util.Scanner;

public class Boj11654_again {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 문자를 아스키코드로 변환하는 문제
        String text = scanner.next(); // 나는 nextLine() 쓰려고 했는데 하루코딩님은 next() 사용하심 - next() : read the next word(단어 하나만) / nextLine() : read the entire line(문장 전체)
        char textChar = text.charAt(0); // 글자이기 떄문에 char 값으로 하나 꺼낸다
        System.out.println((int)textChar); // int 로 캐스팅만 해주면 아스키 값 출력 완전간단하게 가능 in Java!! 오

        // 만약 이번엔 숫자를 아스키코드 로 변환하고 싶다면?
        int num = scanner.nextInt();
        System.out.println((char) num);
    }
}
