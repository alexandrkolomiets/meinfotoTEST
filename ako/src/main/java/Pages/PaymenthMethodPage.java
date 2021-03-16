package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymenthMethodPage {
    public PaymenthMethodPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

        @FindBy(xpath = "//div[@id='ADYEN_BLOCK']")
        public WebElement CreditCart;
        @FindBy(xpath = "//input[@id='cardHolder']")
        public WebElement CartName;
        @FindBy(xpath = "//input[@id='cardNumber']")
        public WebElement CardNumber;
        @FindBy(xpath = "//select[@id='cardExpirationMonth']")
        public WebElement Months;
            @FindBy(xpath = "//option[contains(text(),'10 - Oktober')]")
            public WebElement Months10;
        @FindBy(xpath = "//select[@id='cardExpirationYear']")
        public WebElement Years;
            @FindBy(xpath = "//option[contains(text(),'2020')]")
            public WebElement Year2020;
        @FindBy(xpath = "//input[@id='cardSecurityCode']")
        public WebElement CvvCode;
        @FindBy(xpath = "//*[@id='paymentMethod:proceed']/button")
        public WebElement clickButtonWeiter;
    }

