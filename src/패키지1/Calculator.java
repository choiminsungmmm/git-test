package 패키지1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String msg = "msg1";

        while (!msg.equals("exit")) {
            System.out.println("첫번째 숫자를 입력하세요 :");
            int fn = sc.nextInt();                          //fn =first number (첫번째 숫자)
            sc.nextLine();

            System.out.println("기호를 입력하세요.");
            String sign = sc.nextLine();

            System.out.println("두번쨰 숫자를 입력하세요 :");
            int sn = sc.nextInt();                 //sn =second number (두번째 숫자)
            sc.nextLine();

            if (sign.equals("+")) {
                System.out.println(fn + sn);           //더하기
            } else if (sign.equals("-")) {
                System.out.println(fn - sn);           //빼기
            } else if (sign.equals("*")) {
                System.out.println(fn * sn);        // 곱하기
            } else if (sign.equals("/")) {
                if (sn == 0) {
                    System.out.println("값을 구할 수 없습니다.");      // fn or cn 이 0일때 값은 구할수 X
                } else {
                    System.out.println(fn / sn);       // 나누기
                }
            }

            System.out.println("더 계산하시겠습니까? (exit 입력시 종료)");

            System.out.println("종료는 exit 입력하세요");

            msg = sc.nextLine();

        }
    }
}
