package Kiosk;

import java.util.ArrayList;
import java.util.Scanner;

public class Kiosk {
    /**
     * 속성
     */
    public ArrayList<MenuItem> burgerList;
    public ArrayList<MenuItem> drinkList;
    public ArrayList<MenuItem> dessertList;

    /**
     * 생성자
     *
     * @param menuItemList
     */
    public Kiosk(ArrayList<MenuItem> menuItemList, ArrayList<MenuItem> menuItemList2, ArrayList<MenuItem> menuItemList3) {
        this.burgerList = menuItemList;
        this.drinkList = menuItemList2;
        this.dessertList = menuItemList3;
    }

    /**
     * 기능
     */
    public void start() {
        /**
         * Scanner 객체 생성
         */
        Scanner sc = new Scanner(System.in);   // sc = Scanner

        /**
         * 반복문을 사용
         */
        while (true) {
            /**
             * 메뉴 보여주는곳
             */
            System.out.println(" [ Mcdonalds MENU ] ");
            System.out.println(" 1. 버거 ");
            System.out.println(" 2. 음료 ");
            System.out.println(" 3. 디저트 ");
            System.out.println(" 0. 종료");

            /**
             * 첫번쨰 메뉴 입력 받는곳
             */
            int userInput = sc.nextInt();
            sc.nextLine();

            /**
             * 선택한 아이템을 출력하는곳
             * 0번을 선택시 시스템 종료
             * 메뉴아이템 1번을 선택시 버거 아이템 출력
             */
            if (userInput == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (userInput == 1) {
                System.out.println(" 버거 메뉴입니다.");

                int menuNumber = 1;        //출력 부분에 첫 시작이 1. 2. 3. 이렇게 나옴
                for (int i = 0; i < burgerList.size(); i++) {
                    MenuItem item = burgerList.get(i);
                    System.out.println(
                            menuNumber++ + "." + item.getName() + "    금액 :  " + item.getPrice() + "  설명 :  " + item.getDescription());
                }

            } else if (userInput == 2) {
                System.out.println(" 읍료 메뉴입니다.");

                int menuNumber = 1;        //출력 부분에 첫 시작이 1. 2. 3. 이렇게 나옴
                for (int i = 0; i < drinkList.size(); i++) {
                    MenuItem item2 = drinkList.get(i);
                    System.out.println(
                            menuNumber++ + "." + item2.getName() + "    금액 :  " + item2.getPrice() + "  설명 :  " + item2.getDescription());
                }
            } else if (userInput == 3) {
                System.out.println(" 디저트 메뉴입니다.");

                int menuNumber = 1;        //출력 부분에 첫 시작이 1. 2. 3. 이렇게 나옴
                for (int i = 0; i < dessertList.size(); i++) {
                    MenuItem item3 = dessertList.get(i);
                    System.out.println(
                            menuNumber++ + "." + item3.getName() + "    금액 :  " + item3.getPrice() + "  설명 :  " + item3.getDescription());
                }
            } else{
                System.out.println("잘못선택했습니다.");
                continue;      //  continue : 해당순서를 패스하고싶을떄 사용함
            }


            /**
             * 두번째 메뉴 입력 받는곳
             */
            int userInput2 = sc.nextInt();
            sc.nextLine();

            /**
             * 내가 선택한 음식
             */

            if (userInput == 1) {
                MenuItem select = burgerList.get(userInput2 - 1); // 내가 선택한 음식을get한 여기서 설정함
                System.out.println("선택한 메뉴  : " + select.getName());
                System.out.println("이름   : " + select.getPrice());
                System.out.println("설명   : " + select.getDescription());
                System.out.println("-----------------------------");
            } else if (userInput == 2) {
                MenuItem select2 = drinkList.get(userInput2 - 1);
                System.out.println("선택한 메뉴  : " + select2.getName());
                System.out.println("이름   : " + select2.getPrice());
                System.out.println("설명   : " + select2.getDescription());
                System.out.println("-----------------------------");
            } else if (userInput == 3) {
                MenuItem select3 = dessertList.get(userInput2 - 1);
                System.out.println("선택한 메뉴  : " + select3.getName());
                System.out.println("이름   : " + select3.getPrice());
                System.out.println("설명   : " + select3.getDescription());
                System.out.println("-----------------------------");
            }

        }
    }
}
