package 패키지2;
//1 속성
public class Person {
    String name;
    int age;
    String address;

    //2. 생성자
    Person(String name,int age){
        this.name = name;
        this.age = age;
    }
        //3.기능
        void sayMyName(){
            System.out.println("나의 이름은" +this.name + "입니다");
            System.out.println("나의 나이는" +this.age + "입니다");
        }

        int sum(int value1, int value2){
           int result = value1 + value2;
            return result;
        }



}
