package stepDefinition;

import lombok.Data;

@Data
public class Book {
    private String BookName;
    private String Author;

    public Book(String BookName, String Author){
        this.Author=Author;
        this.BookName=BookName;
    }

    public Book(String bookName) {
        this.BookName=bookName;
    }

    public static Book parseBookDetails(String bookDetails) {
        String[] bookDetail = bookDetails.split(" is ");
        return new Book(bookDetail[0],bookDetail[1]);
    }

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String bookName) {
        BookName = bookName;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }
}
