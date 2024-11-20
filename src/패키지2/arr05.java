package 패키지2;

public class arr05 {
    public static void main(String[] args) {
        // 문자(char) ,문자열(String)
        // String =char[]
        // 기본형 변수 vs 참조형 변후
        // 1.기본형 변수 ' 소문자로 시작' 참조형 변수는 '대문자로 시작'
        // -Wrapper class 에서 기본형 변수를 감싸줄떄 박싱int ->Integer
        // 2. 기본형 변수는 값 자체를 저장, 참조형 변수는 별도의 광간에 값을 저장후 그 주소를 저장함
        // char
        String str ="ABCD";
        // (1) length
        int strLength = str.length();
        System.out.println(strLength);

        //(2) charAt (int index)
        char strChar = str.charAt(1);
        System.out.println(strChar);

        String strSub = str.substring(0,3);
        System.out.println(strSub);

        String newStr = "ABCD";
        boolean strEqual = newStr.equals(str);
        System.out.println(strEqual);



    }
}
