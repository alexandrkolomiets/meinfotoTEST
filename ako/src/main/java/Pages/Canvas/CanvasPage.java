package Pages.Canvas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CanvasPage {

    public CanvasPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//div[@class='body']//input[@class='js-du-file fileinput']")
    public WebElement UploadButton;
}
