package StepDefenition;

import Base.BaseUtil;
import Pages.*;
import Pages.Canvas.CanvasPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;


public class CanvasStep extends BaseUtil {


    private BaseUtil base;

    public CanvasStep(BaseUtil base) {
        this.base = base;

    }

    @Given("^User opens Chrome browser and move to the canvas page of shop meinfoto$")
    public void userOpensChromeBrowserAndMoveToTheCanvasPageOfShopMeinfoto() {
        base.Driver.navigate().to("https://www.meinfoto.de/foto-in-gross/foto-auf-leinwand.jsf");
        base.Driver.manage().window().maximize();
    }

    @When("^User click on \"([^\"]*)\" from teaser$")
    public void userClickOnFromTeaser(String button) {
        base.Driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        CanvasPage page = new CanvasPage(base.Driver);
        page.UploadButton.sendKeys(System.getProperty("user.dir") + "/src/main/resources/k.jpg");
    }

    @Then("^User should move on configurator page with uploaded image$")
    public void userShouldMoveOnConfiguratorPageWithUploadedImage() {
    }

    @And("^User is available to choose needed \"([^\"]*)\"$")
    public void userIsAvailableToChooseNeededFormat(String button) {
        base.Driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        ConfiguratorPage page = new ConfiguratorPage(base.Driver);
        page.ConfigButton.click();
    }

    @And("^User on cart page check that selected product is displayed correctly$")
    public void userOnCartPageCheckThatSelectedProductIsDisplayedCorrectly() {
    }

    @And("^User is available to choose \"([^\"]*)\"$")
    public void userIsAvailableToChoose(String arg0) throws InterruptedException {
        CartPage page = new CartPage(base.Driver);
        Actions actions = new Actions(base.Driver);
        actions.moveToElement(page.DropDownQuantity);
        actions.perform();
        Thread.sleep(3000);
        page.DropDownQuantity.click();
        Thread.sleep(3000);
        page.Quantity4.click();
        base.Driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

    }

    @And("^User click on \"([^\"]*)\" and move on orderaddress page$")
    public void userClickOnAndMoveOnOrderaddressPage(String arg0) {
        CartPage page = new CartPage(base.Driver);
        page.ClickButton.click();
    }

    @And("^User fill all \"([^\"]*)\" from delivery table$")
    public void userFillAllFromDeliveryTable(String arg0) throws InterruptedException {
        OrderaddessPage page = new OrderaddessPage(base.Driver);
        page.EmailField.sendKeys("testing@mailforspam.com");
        page.GenderDropDown.click();
        Thread.sleep(2000);
        page.Male.click();
        page.FirstName.sendKeys("TestingFirstName");
        page.LastName.sendKeys("TestingLastName");
        page.Adress.sendKeys("#reject 2");
        page.PostalCode.sendKeys("45321");
        page.City.sendKeys("TEST");
        page.Telephone.sendKeys("79363845");
        page.Clickbutton.click();
    }

    @And("^User click on CTA button and move on  payment page$")
    public void userClickOnCTAButtonAndMoveOnPaymentPage() {
    }


    @And("^User select \"([^\"]*)\" payment method$")
    public void userSelectPaymentMethod(String arg0) throws InterruptedException {
        PaymenthMethodPage page = new PaymenthMethodPage(base.Driver);
        base.Driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        Thread.sleep(2000);
        page.CreditCart.click();
    }

    @And("^User fill all \"([^\"]*)\" from credit card payment table$")
    public void userFillAllFromCreditCardPaymentTable(String arg0) {
        PaymenthMethodPage page = new PaymenthMethodPage(base.Driver);
        page.CartName.sendKeys("Bijenkorf");
        page.CardNumber.sendKeys("5100081112223332");
        page.Months.click();
        page.Months10.click();
        page.Years.click();
        page.Year2020.click();
        page.CvvCode.sendKeys("737");
    }

    @And("^User click on \"([^\"]*)\" and move on confirmorder page$")
    public void userClickOnAndMoveOnConfirmorderPage(String arg0) {
        PaymenthMethodPage page = new PaymenthMethodPage(base.Driver);

        Actions actions = new Actions(base.Driver);
        actions.moveToElement(page.clickButtonWeiter);
        actions.perform();
        page.clickButtonWeiter.click();
    }

    @And("^User check that selected product is displayed correctly$")
    public void userCheckThatSelectedProductIsDisplayedCorrectly() {

    }

    @And("^User click on \"([^\"]*)\"$")
    public void userClickOn(String arg0) {
        ConfirmOrderPage page = new ConfirmOrderPage(base.Driver);
        page.ConfirmPurchaseButton.click();
    }

    @Then("^User will be redirected on ordersuccessfully page and \"([^\"]*)\" tracking order$")
    public void userWillBeRedirectedOnOrdersuccessfullyPageAndTrackingOrder(String arg0) {

    }
}
