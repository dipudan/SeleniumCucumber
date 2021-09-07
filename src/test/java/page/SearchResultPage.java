package page;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SearchResultPage {

    private WebDriver driver;

    public SearchResultPage(WebDriver driver){
        this.driver=driver;
    }

    public void verifySearchResult(String titleStartsWith) {

        new WebDriverWait(driver, Duration.ofSeconds(10)).until(new ExpectedCondition<Boolean>(){
            public Boolean apply(WebDriver d) {
                return d.getTitle().toLowerCase().startsWith(titleStartsWith);
            }
        });

        Assert.assertTrue("Assert page title :\""+driver.getTitle()+"\" contains text :\""+titleStartsWith+"\"",
                driver.getTitle().toLowerCase().contains(titleStartsWith));
    }

}
