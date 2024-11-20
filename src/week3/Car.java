package week3;

public class Car {
    //<필드영역>

    //1) 고유 데이터 영역
    String commpany; //자동차 회사
    String model = "Gv80"; // 자동차 모델
    String color; // 자동차 색
    double price; //자동차 가격
    //2) 상태 데이터 영역
    double speed; //자동차 속도
    char gear; //기어 상태 {P,R,N,D)
    boolean lights = true;   // 자동차 조명의 상태

    //객체 데이터 영역
    Tire tire = new Tire();
    Door door;
    Handle handle;
    //생성자  처음 객체가 생성될때 어떤 조직을 수행하며어떤값이 필수로 들어와야하는지 정의
// <생성자 영역>
    public Car(){
        System.out.println("ddd111");
        //logic
        //기본생성자 : 생략이 가능
    }


    // <매서드 영역>

    //gasPedal
    // input :kmh
    // output: speed
    double gasPedl(double kmh, char type){
        changeGear(type); //가속도 페달을 밟으면 자동으로 기어가 변한다.
        speed = kmh;
        return  speed;
    }
    //brakpedal
    //input : x
    //output : speed
    double breakpeal(){
        speed = 0;
        return speed;
    }

    //changeGear
    //input: gear(char type)
    //output : gear
    char changeGear (char type){
        gear =type;
        return gear;
    }

    //onOffLight
    //input :x
    //output : Lights(boolean)
    boolean onOffLights(){
        lights =!lights;
        return lights;
    }

    //horn
    //input : x
    //output : x
    void horn (){
        System.out.println("빵빵");
    }
    // 자동차의 속도.. 가변길이 매서드
    void carSpeeds(double ... speeds) {
        for (double v : speeds){
            System.out.println("v = "+v);
        }
    }





}
