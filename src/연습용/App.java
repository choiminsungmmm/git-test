package 연습용;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("첫번째 숫자를 입력하세요");
            int fn = sc.nextInt();
            sc.nextLine();
            System.out.println("두번쨰 숫자를 입력하세요");
            int sn = sc.nextInt();
            sc.nextLine();
            System.out.println("사칙연산 기호를 입력하세요");
            String sign = sc.nextLine();
            // 사칙연산부분이라서 sc.nextInt(); 있으면안됨!!! 값이 출력안됨

            int answer = calculator.Calculate(fn, sn, sign);// 앞에 int answer 쓰는 이유: Calculator 클래스부분에 int가있으니까!!!

            System.out.println("결과값은 : " + answer);
            System.out.println("삭제를 원하시면 remove");//삭제 문구가 나오고나서
            String str = sc.nextLine();             // 사용자가 입력할수있게 표시를 해줘야한다.
            // 마찬가지로 여기도 sc.nextInt 사용 X
            if (str.equals("remove")) {
                calculator.removeanswer();

                System.out.println("삭제되었습니다.");
            }
            System.out.println("입력란 (exit : 종료)");
            String str1 = sc.nextLine();
            // 마찬가지로 여기도 sc.nextInt 사용 X
            if (str1.equals("exit")) {
                System.out.println("프로그램이 종료가 되었습니다.");
                break;
            }
        }
        System.out.println(calculator.list.toString());// 전체값 리스트를 [] 묶어서 출력

    }
}
