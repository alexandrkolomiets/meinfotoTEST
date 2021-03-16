package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
    public CartPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "shoppingcartForm:j_id_2o_2_6:0:itemQuantity")
    public WebElement DropDownQuantity;
        @FindBy(xpath = "//body//option[4]")
         public WebElement Quantity4;
    @FindBy(xpath = "//button[@id='shoppingcartForm:proceedToCheckout']")
    public WebElement  ClickButton;
}

