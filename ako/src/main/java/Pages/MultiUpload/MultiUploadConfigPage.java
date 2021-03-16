package Pages.MultiUpload;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MultiUploadConfigPage {
    public MultiUploadConfigPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath ="//button[@class='button -action -shapy -wide -noIcon -main -arrow']")
    public WebElement Confirm;
    @FindBy(xpath = "//a[@id='itemConfiguratorForm:j_id_he']")
    public WebElement ClickButton;

}
