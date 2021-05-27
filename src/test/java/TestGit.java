import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestGit {

    WebDriver driver;

    @BeforeMethod
    public void ouvrirChrome() {
        driver = new ChromeDriver();
        driver.get("https://www.amazon.fr/");
        driver.manage().window().maximize();

        By cookiesSelector = By.name("accept");
        driver.findElement(cookiesSelector).click();
    }

    //@AfterMethod
    //public void fermerChrome() {
      //  driver.quit();
   // }

    @Test
    public void testAmazon() {
        //Arrange
        String Textnintendo = "Nintendo";

        //Act

        HomePageAmazon Page = new HomePageAmazon(driver);
        String isTextexist = Page.writeNintendo().validatechoice().OpenNintendo().isNameExist();

        //Asserts
        Assert.assertTrue(isTextexist.contains(Textnintendo), "Le texte [" + isTextexist + "] ne contient pas la chaine [" + Textnintendo + "].");


    }
}
