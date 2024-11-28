package library세션강의중요;

import java.util.ArrayList;
import java.util.List;

public class Library {
    //속

    private List<Book> books;   // Arraylist

    //생성자

    public Library(){
        books = new ArrayList<>();
    }
    //기능
//    도서관에 책 추가


    public void addBook(Book book){
       books.add(book);
    }
    //    도서관에서 책 제거
    public void removeBook(Book book){
        books.remove(book);
    }
//    도서관에서 책 이름으로 검색
    public  Book searchByTitle(String title) {
        for (Book book : books) {
            String foundBookTitle = book.getTitle();
            if (foundBookTitle.equals(title)) {
                return book;
            }


            // 방법2  if(book.getTitle().equals(title))
            }
        return null;
    }

}
