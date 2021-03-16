package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrdersuccessPage {
    public OrdersuccessPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
            @FindBy(xpath = "//strong[contains(text(),'test!')]")
            public WebElement CheckResult;
    }
