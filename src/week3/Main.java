package week3;

public class Main {
    public static void main(String[] args) {
    Car car = new Car();    //객체 생성

        System.out.println("페달 밣기 잔 car.gear = " + car.gear);

        // 매서드 호출 및 변환값을 저장
        double speed = car.gasPedl(100,'D');
        System.out.println("speed = " + speed);

        boolean lights = car.onOffLights();
        System.out.println("lights =" + lights);

        System.out.println();
        System.out.println("페달 밣고 난 후 car.gear = " + car.gear);


        System.out.println();
        car.carSpeeds(100, 80);
        System.out.println();
        car.carSpeeds(110,120,150);
    }
}
