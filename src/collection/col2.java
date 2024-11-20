package collection;

import java.util.LinkedList;

public class col2 {
    public static void main(String[] args) {

         // link List 빠름
        //기본적 기능 -> ArrayList 와 동일
        //LinkedList  여기저기 값을 나누어서 값 느림
        // 값을 추가하거나 삭제할때는 빠르다

        LinkedList<Integer> linkedList = new LinkedList<Integer>(); // 선언 및 생성

        linkedList.add(5);
        linkedList.add(10);
        linkedList.add(3);

        System.out.println(linkedList.get(0)); // 5출력
        System.out.println(linkedList.get(1)); // 10 출력
        System.out.println(linkedList.get(2)); // 3 출력
        System.out.println(linkedList.toString()); // [1,2,3] 출력 (속도 느림)
        linkedList.add(200);

        System.out.println(linkedList.toString());

        linkedList.add(2, 4); // 2번 순번에 4 값을 추가합니다.
        System.out.println(linkedList); // [1,2,4,3] 출력


        linkedList.set(1, 30); // 1번순번의 값을 30으로 수정합니다.
        System.out.println(linkedList.toString());

        linkedList.remove(1);
        System.out.println(linkedList.toString());

        linkedList.clear(); // 전체 값을 삭제합니다.
        System.out.println(linkedList); // [] 출력

    }
}
