package collection;

import java.util.HashMap;
import java.util.Map;

public class col6 {
    public static void main(String[] args) {
        //map : key = value pair ->중요
        // key라는 값으로 유니크하게 보장이 돼야함
        // Map -> HashMap,treeMap 으로응용
        Map<String,Integer> intMap = new HashMap<>();

        //키 값
        intMap.put("일", 11);
        intMap.put("이", 12);
        intMap.put("삼", 13);
        intMap.put("삼", 14);   // 중복key
        intMap.put("삼", 15);   // 중복key

        //key 값 전체 출력 (향상된 for문)
        for(String key: intMap.keySet()){
            System.out.println(key);
        }

        for(Integer value: intMap.values()){
            System.out.println(value);
        }

        System.out.println(intMap.get("삼"));

    }
}
