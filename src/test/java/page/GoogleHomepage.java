package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class GoogleHomepage {

    @FindBy(how = How.NAME, using = "q")
    public WebElement txtSearchBox;

    public GoogleHomepage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void searchForText(String sSearchText){
        txtSearchBox.sendKeys(sSearchText);
        txtSearchBox.submit();
    }
}
