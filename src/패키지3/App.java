package 패키지3;

import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
       Calculator calculator = new Calculator();
        Scanner sc = new Scanner(System.in);


        // 과제1과 다르게 while을 다르게 써봤고, if문을 switch로 써봤다.

        while(true) {      //반복문
            System.out.println("첫번째 숫자를 입력하세요. : ");
            int fn = sc.nextInt();          //fn = first number
            sc.nextLine();

            System.out.println("두번째 숫자를 입력하세요. : ");
            int sn =sc.nextInt();        //sn  = second number
            sc.nextLine();

            System.out.println("기호를 입력하세요.");
            String sign = sc.nextLine();

          int answer =calculator.calculate(fn,sn,sign);
            System.out.println("결과값은 : " +answer);
            System.out.println("삭제를 원하시면 remove");
            String str=sc.nextLine();
            if (str.equals("remove")){
               calculator.removeResult();
                System.out.println("삭제되었습니다.");
            }

            System.out.println("입력란(exit : 종료)");
            String str1 = sc.nextLine();

            if (str1.equals("exit")){
                System.out.println("프로그램을 종료합니다.");
                break;
            }

        }
        System.out.println(calculator.saveresult.toString());


    }
}
