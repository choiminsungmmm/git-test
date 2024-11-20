패키지 1 과제 1번째꺼입니다  
패키지 3 과제 2번째꺼입니다.

# Calculator 프로그램

이 프로젝트는 간단한 콘솔 기반의 계산기 프로그램입니다. 사용자는 두 개의 숫자와 연산자를 입력하여 기본적인 사칙연산을 수행할 수 있습니다.

## 기능

- 두 개의 숫자 입력
- 사칙연산 기호 입력 (+, -, *, /)
- 결과 출력
- 'exit' 입력 시 프로그램 종료

## 사용 방법

1. 프로그램을 실행합니다.
2. 첫 번째 숫자를 입력합니다.
3. 연산 기호를 입력합니다.
4. 두 번째 숫자를 입력합니다.
5. 결과가 출력됩니다.
6. 추가 계산을 원하면 계속 입력하고, 종료하려면 'exit'를 입력합니다.

## 코드 예시

```java
package 패키지1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String msg = "msg1";

        while (!msg.equals("exit")) {
            System.out.println("첫번째 숫자를 입력하세요 :");
            int fn = sc.nextInt();                          
            sc.nextLine();

            System.out.println("기호를 입력하세요.");
            String sign = sc.nextLine();

            System.out.println("두번쨰 숫자를 입력하세요 :");
            int sn = sc.nextInt();                 
            sc.nextLine();

            if (sign.equals("+")) {
                System.out.println(fn + sn);           
            } else if (sign.equals("-")) {
                System.out.println(fn - sn);           
            } else if (sign.equals("*")) {
                System.out.println(fn * sn);        
            } else if (sign.equals("/")) {
                if (sn == 0) {
                    System.out.println("값을 구할 수 없습니다.");      
                } else {
                    System.out.println(fn / sn);       
                }
            }

            System.out.println("더 계산하시겠습니까? (exit 입력시 종료)");
            msg = sc.nextLine();
        }
    }
}
