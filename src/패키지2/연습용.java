package 패키지2;

import java.util.Stack;

public class 연습용 {
    public static void main(String[] args) {
        Stack<Integer>intStack = new Stack<Integer>();   //선언 및 생성

        intStack.push(10);
        intStack.push(15);
        intStack.push(1);

        //다 지워질떄 까지 출력
        while (!intStack.isEmpty()){     //비어 있으면 true, 안비어 있으면 false 단 !가있어서 반대!!!!
            System.out.println(intStack.pop());       // 가장 늦게 들어간 1이 가장먼저 나온다

        }


    }
}
