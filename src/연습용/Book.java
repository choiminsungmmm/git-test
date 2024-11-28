package 연습용;

public class Book {
    //속생기

//    제목(title)
//    저자(author)
//    대여여부(isAvailable)

    private String title;
    private String author;
    private boolean isAvailable;

//    제목(title)
//    저자(author)
//    대여여부(isAvailable)

    public Book (String title,String author,boolean isAvailable){
        this.title=title;
        this.author=author;
        this.isAvailable=isAvailable;
    }
//    책 제목 조회
//    책 대여여부 조회
//    책 대여여부 설정
//    책 상세 정보 출력
    public String getTitle(){
        return this.title;
    }
    public boolean getisAvailable(){
        return this.isAvailable;
    }
    public void setisAvailable(boolean flag){
        this.isAvailable=flag;
    }
    public void printBookINFO(){
        System.out.println();
    }











}
