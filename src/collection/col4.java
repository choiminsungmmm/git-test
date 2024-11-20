package collection;

import java.util.LinkedList;
import java.util.Queue;

public class col4 {
    public static void main(String[] args) {
        //Queue :FiFo
        // add ,peek ,poll
        //Queue: 생성자가 없는 인터페이스

        Queue<Integer> intQueue = new LinkedList<>();   //Queue를 선언 ,생성

        intQueue.add(1);
        intQueue.add(5);
        intQueue.add(9);

        while (!intQueue.isEmpty()) {
            System.out.println(intQueue.poll());    //순서대로 출력
        }

        //추가
        intQueue.add(1);
        intQueue.add(5);
        intQueue.add(9);
        intQueue.add(10);

        //peak
        System.out.println(intQueue.peek());
        System.out.println(intQueue.size());






    }
}
