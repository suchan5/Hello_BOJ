package day12;

import java.util.Scanner;
public class Boj11718_again {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) { // 종료에 대한 시그널이 없다. 그러므로 무한정 돌려도 됨
            String text = scanner.nextLine(); // next()는 공백을 기준으로 받는다(그러다보니 단어 를 받는다). 근데 예제는 line 을 줄을 기준으로 받는게 더 낫다. 그러므로 nextLine(). 한줄을 통으로 받겠다는 뜻
            System.out.println(text);
        }
    }
}