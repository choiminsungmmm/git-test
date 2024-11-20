package 패키지2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
       String intputStr = scanner.nextLine();
        int inputInt = scanner.nextInt();


        String name = "john";
        int age = 20;
        Person personA = new Person(name, age);
        personA.sayMyName();
        int ret = personA.sum(1, 2);
        System.out.println("ret" + ret);


        String name2 = "Steve";
        int age2 = 18;
        Person personB = new Person(name2,age2);
        personB.sayMyName();
         personB.sum(10,10);



    }
}
