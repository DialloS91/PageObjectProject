import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePageAmazon {

    WebDriver driver;

    public HomePageAmazon(WebDriver driver){
        this.driver = driver;
    }

    public HomePageAmazon writeNintendo() {
        By Search = By.id("twotabsearchtextbox");
        driver.findElement(Search).sendKeys("Nintendo Switch");
        return this;
    }

    public NintendoSwitchPage validatechoice() {
        By validate = By.id("nav-search-submit-button");
        driver.findElement(validate).click();
        return new NintendoSwitchPage(driver);

    }
}
