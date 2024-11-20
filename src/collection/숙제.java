package collection;

import java.util.*;

public class 숙제 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String CollectionName = sc.nextLine();
        String title =sc.nextLine();

        switch (CollectionName) {
            case  "List" :
                ArrayList<String> strlist = new ArrayList<>();
            while(true){
                String text =sc. nextLine();
                if(Objects.equals(text,"끝")) {
                    break;
                }
                strlist.add(text);
            }
            title = "[ List로 저장된 " + title + "]";   //괄호로 감싸준 제목
                System.out.println(title);
                for(int i=0; i <strlist.size(); i++){
                    int number = i +1;
                    System.out.println(number + "." + strlist.get(i));
                }
                break;
            case  "Map" :
                Map<Integer,String> strMap = new HashMap<>();

                int lineNumber =1;
                while(true){
                    String text =sc. nextLine();
                    if(Objects.equals(text,"끝")) {
                        break;
                    }
                    strMap.put(lineNumber++,text);
                }
                title = "[ Map으로 저장된 " + title + "]";   //괄호로 감싸준 제목
                System.out.println(title);

                for(int i=0; i <strMap.size(); i++){
                    int number = i +1;
                    System.out.println(number + "." + strMap.get(i+1));
                }
                break;

            case  "Set" :
                LinkedHashSet<String> strSet = new LinkedHashSet<>();

//                int lineNumber =1;
                while(true){
                    String text =sc. nextLine();
                    if(Objects.equals(text,"끝")) {
                        break;
                    }
                    strSet.add(text);
                }
                title = "[ set으로 저장된 " + title + "]";   //괄호로 감싸준 제목
                System.out.println(title);
                Iterator iterator = strSet.iterator();

                for(int i=0; i <strSet.size(); i++){
                    int number = i +1;
                    System.out.println(number + "." + iterator.next());
                }
                break;
            default:
                System.out.println("저장할 수 없는 자료구조입니다.");




        }

    }
}
