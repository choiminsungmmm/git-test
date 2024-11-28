package 연습용;

import java.util.Scanner;

public class 키오스크연습용 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);      // sc = Scanner

        int number = 0;
        while (true) {

            System.out.println(" [ Mcdonalds MENU ] ");
            System.out.println(" 1. 버거 ");
            System.out.println(" 2. 음료 ");
            System.out.println(" 3. 디저트 ");
            System.out.println(" 0. 종료");

            int selectMenu = sc.nextInt();
            sc.nextLine();

            if (selectMenu == 1) {

                System.out.println(" [ 버거 메뉴 ] ");
                System.out.println(" 1. 빅맥 버거 | w.6.9 | 순쇠고기 패티,치즈,양상추,피클,양파가 토핑된 버거 ");
                System.out.println(" 2. 더블 맥스파이시 버거 | w.7.9 | 쌀가루 크럼블 시즈닝을 입힌 닭가슴살 패티가 2장! ");
                System.out.println(" 3. 1955 버거 | w.7.9 | 두툼한 쇠고기,특별한 1955소스에 깊은 풍미의 그릴드어니언까지! ");
                System.out.println(" 4. 불고기 버거 | w.5.9 | 한국인 입맛에 딱!! 맞는 불고기 소스 ");
                System.out.println(" 0. 뒤로가기 ");

                int num1 = sc.nextInt();
                sc.nextInt();
//                if (selectMenu == 0) {
//
//                }                                뒤로가기 기능???
            } else if (selectMenu == 2) {

                System.out.println(" [ 음료 메뉴 ] ");
                System.out.println(" 1. 코카 콜라  | w.2.9 |");
                System.out.println(" 2. 코카 콜라 제로  | w.2.9 | ");
                System.out.println(" 3. 딸기 쉐이크  | w.3.9 | ");
                System.out.println(" 4. 바닐라 쉐이크  | w.3.9 | ");
                System.out.println(" 0. 뒤로가기 ");

                int num2 = sc.nextInt();
                sc.nextInt();
            } else if (selectMenu == 3) {

                System.out.println(" [ 디저트 메뉴 ] ");
                System.out.println(" 1. 감자튀김  | w.2.9 |");
                System.out.println(" 2. 해쉬 브라운  | w.2.9 |");
                System.out.println(" 3. 소프트 아이스크림  | w.1.9 |");
                System.out.println(" 4. 베리 스트로베리 맥플러리 | w.3.9 |");
                System.out.println(" 0. 뒤로가기");

                int num3 = sc.nextInt();
                sc.nextInt();
            } else if (selectMenu == 0) {
                System.out.println(" 프로그램을 종료합니다. ");
                break;
            }

        }

    }
}
