package Pages.Coussin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoussinPage {
    public CoussinPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//div[@class='btnmlkissen']//input[@class='js-du-file fileinput']")
    public WebElement uploadButtonCoussin;
}
