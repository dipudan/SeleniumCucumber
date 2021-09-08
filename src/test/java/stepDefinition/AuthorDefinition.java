package stepDefinition;

import basePackage.BaseUtil;
import io.cucumber.java.DataTableType;
import io.cucumber.java.ParameterType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.List;
import java.util.Map;

public class AuthorDefinition extends BaseUtil{

    private BaseUtil base;
    private WebDriver driver;

    public AuthorDefinition(BaseUtil base){
        this.base=base;
        this.driver= base.driver;
    }

    @DataTableType
    public Book authorEntry(Map<String, String> entry){
        return new Book(entry.get("BookName"),entry.get("Author"));
    }

    @Given("I map the below books and orders into my shelf.")
    public void iMapTheBelowBooksAndOrdersIntoMyShelf(List<Book> books) {

        bookList =books;
        for(Book myBook : books){
            System.out.println("------Author Name -----" + myBook.getAuthor()
                    +"------Book Name -----" + myBook.getBookName());
        }
    }

    @ParameterType(".*")
    public Book book(String bookName) {
        return Book.parseBookDetails(bookName);
    }

    @Then("I verify the author of book {book}")
    public void iVerifyTheAuthorOfBookAlchemistIsPauloCoelho(Book book) {
        Assert.assertTrue(bookList.contains(book),"Author detail is correct.");
    }
}
