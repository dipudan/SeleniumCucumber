package stepDefinition;

import basePackage.BaseUtil;
import dataTemplate.IsItFriday;
import dataTemplate.User;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class FridayDefinitions {
    private String today;
    private String actualAnswer;
    private BaseUtil base;

    public FridayDefinitions(BaseUtil base){
        this.base=base;
    }

    @Given("today is {string}")
    public void today_is_Sunday(String today) {
        this.today = today;
    }

    @When("I ask whether it's Friday yet")
    public void i_ask_whether_it_s_Friday_yet() {
        actualAnswer = IsItFriday.isItFriday(today);
    }

    @Then("I should be told {string}")
    public void i_should_be_told(String expectedAnswer) {
        assertEquals(expectedAnswer, actualAnswer);
    }

    @When("^I enter the .* and .* from datatable and click on login button$")
    public void iEnterTheAndAndClickOnLoginButton(DataTable loginDetails) {

        /*        List<List<String>> data =loginDetails.asLists();
                for(List user : data)
                System.out.println("I enter the username \""+user.get(0)+"\" and password " +
                        "\""+user.get(1)+"\" and click on login button");*/

        List<User> lUsers= new ArrayList<User>();
        lUsers=loginDetails.asList(User.class);

        for(User user : lUsers){
            System.out.println("I enter the username \""+user.username+"\" and password " +
                    "\""+user.password+"\" and click on login button. And thread :"+Thread.currentThread());
        }
    }
}