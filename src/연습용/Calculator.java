package 연습용;

import java.util.ArrayList;

public class Calculator {
ArrayList<Integer>list=new ArrayList<Integer>();

private int fn;
private int sn;
private int reult;
private int answer;
private String sign;

// 차이점: 생정자(조립설명서)가 없음
   public Calculator(){   //생략가능
   }

public int Calculate(int fn,int sn,String sign ) {

    this.answer = 0;
    boolean True = true;

    switch (sign) {
        case "+":
            answer = fn + sn;
            list.add(answer);
            break;
        case "-":
            answer = fn - sn;
            list.add(answer);
            break;
        case "*":
            answer = fn * sn;
            list.add(answer);
            break;
        case "/":
            if (sn == 0) {
                True = false;
            } else {
                answer = fn / sn;
                list.add(answer);
            }
            break;
        default:
            System.out.println("값을 구할수 없습니다.");
    }
            return this.answer;
}
    public int getAnswer() {
        return answer;
    }
    public void setAnswer(int answer) {
        this.answer = answer;
    }

    /**
     * list에서 요소 삭제
     * 첫번째요소를 삭제합니다
     * @return
     */
    public ArrayList<Integer> removeanswer(){   // 반환함수값에 list라고 int형이라고 하면안되고
            if (list.isEmpty()){                 // ArrayList<Integer> 라고 쓴다!!!
                return this.list;                 // 이것을 해주지않으면 오류가나옴 첫번째 비어있는 요소를 반환해야함
            }
        list.remove(0);         // 작동결과 첫번쨰 부분이 삭제가 되고 내가 원하는 값을
     return this.list;                // remove해도 값이 지워지지않는다
}
        // list.remove(equals("remove")     <---for문 if문을 사용해서(계산기1처럼) 해야함
        // return this.list;              ???
}
