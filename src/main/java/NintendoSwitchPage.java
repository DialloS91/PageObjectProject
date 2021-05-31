import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NintendoSwitchPage {

    WebDriver driver;

    public NintendoSwitchPage(WebDriver driver){ this.driver = driver;}

    public ArticleSwitchPage OpenNintendo(){
        By NomLabel = By.cssSelector("[data-asin='B07WKNQ8JT']");
        driver.findElement(NomLabel).click();
        return new ArticleSwitchPage(driver);

    }
}