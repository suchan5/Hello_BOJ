package day16;

import java.util.Scanner;

public class Boj5597_again {
    public static void main(String[] args) {
        // 교실 30명 (1~30번까지 출석번호가 있다)
        // 28명이 과제 제출 (제출자의 출석번호가 입력으로 주어진다)
        // 제출 안 한 2명의 출석번호를 구하시오
        // 현실에서는 {1,2,3,4,5,6,7,....27,28,29,30} 이렇게 출석번호 두고, 제출하는 애들 출석번호 tick 쳐서 체크했을꺼다! (이걸 프로그래밍에서는 0,1을 이용해서 할 수 있다) => index를 이용합시다

        int A[] = new int[31]; // 처음엔 모두 0으로 초기화 되어있다. Btw 31개까지 만드는 이유는 맨앞의 0번 index는 안쓸꺼야. 0번이란 출석번호는 없으니까!
        Scanner scanner = new Scanner(System.in);
        for (int i=0; i<28; i++) {
            int idx = scanner.nextInt();
            A[idx]++; // 제출한 학생의 index 는 1로 표기된다(일종의 tick 이라고 생각하잨)
        }

        for (int i=1; i<=30; i++) { // 출석번호 1번부터 30번까지 돌면서
            if (A[i] == 0) {
                System.out.println(i);
            }
        }
    }
}