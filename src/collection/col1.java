// ArrayList
// (사용하기 위해선 import java.util.ArrayList; 를 추가해야합니다.)
import java.util.ArrayList;

public class col1 {

    public static void main(String[] args) {
        // list
        // 순서가 있는 데이터의 집합 --> Array(최초 길이를 알아야함)
        // 처음 길이를 몰라도 됨
        // 1) Array --> 정적배열
        // 2) List (Array List) -->동적배열 (크기가 가변적으로 늘어난다)
        //  값이 추가될떄 더큰 공간이 필요하면 더 큰공간을 받아서 저장하니까 상관x



        ArrayList<Integer> intList = new ArrayList<Integer>(); // 선언 및 생성

        intList.add(99);
        intList.add(15);
        intList.add(3);

        System.out.println(intList.get(0)); // 1 출력
        System.out.println(intList.get(1)); // 2 출력
        System.out.println(intList.get(2)); // 3 출력
        System.out.println(intList.toString()); // [1,2,3] 출력

        // 2번째 있는 값(15)을 바꿔보자
        intList.set(1, 10); // 1번순번의 값을 10으로 수정합니다.
        System.out.println(intList.get(1)); // 10 출력

        // intList.remove 삭제
        // inList.clear 안에 내용 모두 삭제
        intList.remove(1); // 1번순번의 값을 삭제합니다.
        System.out.println("클리어 전");
        System.out.println(intList.toString()); // [1,3] 출력
        intList.clear(); // 전체 값을 삭제합니다.
        System.out.println("클리어 후");
        System.out.println(intList.toString()); // [] 출력
    }
}