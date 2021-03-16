package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderaddessPage {
    public OrderaddessPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//input[@id='addressesForm:invoiceEmail']")
    public WebElement EmailField;
         @FindBy(xpath = "//div[@id='addressesForm:invoiceAddress']//div[@class='group gender']//button[@class='label']")
         public WebElement GenderDropDown;
         @FindBy(xpath = "//span[@class='form-dropdown -active']//li[contains(text(),'Herr')]")
         public WebElement Male;
    @FindBy(xpath = "//input[@id='addressesForm:invoiceForename']")
    public WebElement FirstName;
    @FindBy(xpath = "//input[@id='addressesForm:invoiceSurname']")
    public WebElement LastName;
    @FindBy(xpath = "//input[@id='addressesForm:invoiceStreet']")
    public WebElement Adress;
    @FindBy(xpath = "//input[@id='addressesForm:invoiceZipCode']")
    public WebElement PostalCode;
    @FindBy(xpath = "//input[@id='addressesForm:invoiceCity']")
    public WebElement City;
    @FindBy(xpath = "//div[@id='addressesForm:invoiceAddress']//button[@class='label'][contains(text(),'Deutschland')]")
    public WebElement Country;
    @FindBy(xpath = "//input[@id='addressesForm:invoicePhoneNumber']")
    public WebElement Telephone;
    @FindBy(id = "addressesForm:j_id_6e")
    public WebElement Clickbutton;
}
