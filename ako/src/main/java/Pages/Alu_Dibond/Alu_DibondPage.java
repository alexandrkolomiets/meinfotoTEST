package Pages.Alu_Dibond;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Alu_DibondPage {
    public Alu_DibondPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//div[contains(@class,'info')]//form[@class='js-du']//input[@class='js-du-file fileinput']")
    public WebElement uploadButtonAluDibond;
}
