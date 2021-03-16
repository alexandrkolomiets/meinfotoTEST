package Pages.Starmap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StarmapPage {
    public StarmapPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    //CTA button from LP
    @FindBy(xpath = "//button[contains(@class,'js-du-button filebutton button action -arrow')]")
    public WebElement uploadButtonStarmap;

    //CTA button from Config Strmap page]
    @FindBy(id = "itemConfiguratorForm:j_id_5v")
    public WebElement configuratorButton;
}
