package 패키지3;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    ArrayList<Integer> saveresult = new ArrayList<Integer>();
    private int fn, sn, result,answer;
    private String sign;
    // 두개의 숫자랑 연사자릉 받을수 있게 수정
    public int calculate(int fn,int sn,String sign){


        int answer = 0;
        boolean True =true;

        switch (sign){
            case  "+" :
                answer = fn+sn;  //더하기
                saveresult.add(answer);
                break;
            case "-" :
                answer = fn-sn;  //뺴기
                saveresult.add(answer);
                break;
            case "*" :
                answer = fn*sn;  //곱하기
                saveresult.add(answer);
                break;
            case "/" :
                if(sn==0){
                    True = false;
                } else {
                  answer = fn/sn;  // 나누기
                    saveresult.add(answer);
                } break;

            default:
                System.out.println("값을 구할수없습니다.");
        }
            return answer;
    }
        public int getAnswer(){
            return answer;
        }
        public void setAnswer(int answer){
            this.answer = answer;
        }

        public void removeResult(){
            if(saveresult.isEmpty()){
                return;
            }
            saveresult.remove(0);

        }




}
