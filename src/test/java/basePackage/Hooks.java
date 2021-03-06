package basePackage;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hooks extends BaseUtil {


    private WebDriver driver;
    private BaseUtil base;

    public Hooks(BaseUtil base){
        this.base=base;
    }

    @Before("@ui-test")
    public void setup(){

            String sBrowser="chrome";

            if(System.getProperty("browser")!=null)
                sBrowser=System.getProperty("browser");

            switch(sBrowser) {
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver= new FirefoxDriver();
                    break;
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    ChromeOptions chromeOptions = new ChromeOptions();
                    chromeOptions.addArguments("--headless");
                    driver= new ChromeDriver(chromeOptions);
                    break;
            }
            base.driver=this.driver;
            driver.manage().window().maximize();
    }

    @After("@ui-test")
    public void closeBrowser() {
            driver.quit();
    }

}
