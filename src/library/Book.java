package library;

public class Book {

    //속성(변수)
  private String title;
  private String author;

  //생성자(조립설명서)
   public Book(String title,String author){
//    this.title;
//    this.author;
//    title;
//    author;
   //  -->
   this.title=title;
   this.author=author;
   }
   //3 기능

//void doSomething(){
//    System.out.println("dddd");

    /**
     * 더하기 기능
     */
    int add (int a,int b ){
       int ret =a+b;
        return ret;
        // return = a+b;

    }


}
