package equal;



public class Main {
    public static void main(String[] args) {
        System.out.println("프로그램의 시작점");

        int a =1;
        int b =1;
        int c =2;

        Book bookA = new Book("소년이 온다","한강");
        Book bookB = new Book("소년이 온다","한강");
        Book bookC = new Book("채식주의자","한강");


        boolean ret= (bookA.equals(bookB));


        System.out.println("ret = " + ret);




    }
}
