package stepDefinition;

import basePackage.BaseUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import page.GoogleHomepage;
import page.SearchResultPage;

public class CheeseDefinition extends BaseUtil{

    private BaseUtil base;
    private WebDriver driver;

    public CheeseDefinition(BaseUtil base){
        this.base=base;
        this.driver= base.driver;
    }

    @Given("I am on the Google search page")
    public void i_am_on_the_google_search_page() {
        driver.get("https://www.google.com/");
    }

    @When("I search for {string}")
    public void i_search_for(String searchString) {

        GoogleHomepage objPage = new GoogleHomepage(driver);

        objPage.searchForText(searchString);
    }

    @Then("the page title should start with {string}")
    public void the_page_title_should_start_with(String titleStartsWith) {

        SearchResultPage objPage = new SearchResultPage(driver);
        objPage.verifySearchResult(titleStartsWith);
    }
}