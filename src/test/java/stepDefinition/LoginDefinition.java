package stepDefinition;

import basePackage.BaseUtil;
import com.aventstack.extentreports.GherkinKeyword;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;

public class LoginDefinition extends BaseUtil {

    private BaseUtil base;
    private WebDriver driver;

    public LoginDefinition(BaseUtil base){
        this.base=base;
        this.driver= base.driver;
    }

    @Given("Click on the login button")
    public void click_on_the_login_button() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User clicked on the login button.");
    }

    @Then("The login page is displayed with Username and Password textbox")
    public void the_login_page_is_displayed_with_username_and_password_textbox() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Login page is displayed with Username and Password.");
    }

    @Then("I should navigate to the homepage.")
    public void i_should_navigate_to_the_homepage() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I navigate to the homepage.");

    }

    //@Given("I navigate to the {string} application")
    @Given("^I navigate to the \"([^\"]*)\" application$")
    public void iNavigateToTheApplication(String eCommApplication) {
        System.out.println("I launch the "+eCommApplication+" application.");
    }
}
