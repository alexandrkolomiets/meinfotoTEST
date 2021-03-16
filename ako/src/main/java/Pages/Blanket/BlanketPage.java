package Pages.Blanket;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BlanketPage {
    public BlanketPage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[contains(@class,'info')]//input[@class='js-du-file fileinput']")
    public WebElement CtaButton;
}
