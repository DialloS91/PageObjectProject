import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ArticleSwitchPage {

    WebDriver driver;

    public ArticleSwitchPage(WebDriver driver){ this.driver = driver;}



    public String isNameExist(){
        By Label = By.id("bylineInfo");
        String LabelSwitch = driver.findElement(Label).getText();
        return LabelSwitch;

    }
}