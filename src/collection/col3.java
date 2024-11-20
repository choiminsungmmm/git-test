// Stack
// (사용하기 위해선 import java.util.Stack; 를 추가해야합니다.)
import java.util.Stack;

public class col3 {


       //Stack
        //push,peek,pop
        // 최근 저장된 데이터를 나열하고싶거나,데이터 중복 처리를 막고싶을떄



        public static void main(String[] args) {
        Stack<Integer> intStack = new Stack<Integer>();  //선언 및 생성

        intStack.push(10);
        intStack.push(15);
        intStack.push(1);

        while (!intStack.isEmpty()) { // 다 지워질때까지 출력
            System.out.println(intStack.pop()); // 3,2,1 순서로 출력
        }

        // 다시 추가
        intStack.push(10);
        intStack.push(15);
        intStack.push(1);

        // peek()
        System.out.println(intStack.peek()); // 3째꺼 출력
        System.out.println(intStack.size()); // 3 출력 , 갯수말하는거임 (peek() 할때 삭제 안됬음)

        // pop()
        System.out.println(intStack.pop()); // 3 출력
        System.out.println(intStack.size()); // 2 출력 (pop() 할때 삭제 됬음)

        System.out.println(intStack.pop()); // 2 출력
        System.out.println(intStack.size()); // 1 출력 (pop() 할때 삭제 됬음)

        while (!intStack.isEmpty()) { // 다 지워질때까지 출력
            System.out.println(intStack.pop()); // 1 출력 (마지막 남은거 하나)
        }
    }
}