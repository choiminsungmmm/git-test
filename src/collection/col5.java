package collection;

import java.util.HashSet;
import java.util.Set;

public class col5 {
    public static void main(String[] args) {

        Set<Integer>intSet = new HashSet<>();   //선언 및 생성

        intSet.add(1);
        intSet.add(12);
        intSet.add(5);
        intSet.add(9);
        intSet.add(1);
        intSet.add(12);

        for (Integer value : intSet) {
            System.out.println(value);
        }

        //contains
        System.out.println(intSet.contains(2));
        System.out.println(intSet.contains(5));



    }
}
