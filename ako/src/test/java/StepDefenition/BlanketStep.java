package StepDefenition;

import Base.BaseUtil;
import Pages.Blanket.BlanketPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import java.util.concurrent.TimeUnit;

public class BlanketStep extends BaseUtil {

    private BaseUtil base;
    public BlanketStep(BaseUtil base) {
        this.base = base;
    }
    @When("^User click on \"([^\"]*)\" from shapix page$")
    public void userClickOnFromShapixPage(String arg0) {
        base.Driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        BlanketPage page = new BlanketPage(base.Driver);
        page.CtaButton.click();
    }
    @Given("^User opens Chrome browser and move to the blanket page of shop meinfoto$")
    public void userOpensChromeBrowserAndMoveToTheBlanketPageOfShopMeinfoto() {
        base.Driver.navigate().to("https://www.meinfoto.de/foto-auf-heimtextilien/foto-decke.jsf");
        base.Driver.manage().window().maximize();
    }
    @When("^User click on \"([^\"]*)\" from Blanket teaser$")
    public void userClickOnFromBlanketTeaser(String arg0) throws InterruptedException {
        base.Driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        BlanketPage page = new BlanketPage(base.Driver);
        page.CtaButton.sendKeys(System.getProperty("user.dir") + "/src/main/resources/k.jpg");
    }
}