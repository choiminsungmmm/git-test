package equal;

import java.util.Objects;

public class Book {
//속생기




    /**
     *제목
     * 내용
     */
    private String title;
    private String author;

    /**
     *책 생성자
     * @param title 제목
     * @param author 작가
     */
    public Book(String title, String author) {
        this.title = title;
        this.author = author;

    }

    /**
     * 게터
     * 책 객체의 제목을 반환합니다.
     * @return 책 제목
     */
    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author);
    }
}


