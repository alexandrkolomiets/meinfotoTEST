package StepDefenition;

import Base.BaseUtil;
import Pages.Coussin.CoussinPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

import java.util.concurrent.TimeUnit;

public class CoussinStep extends BaseUtil {
    private BaseUtil base;
    public CoussinStep(BaseUtil base) {
        this.base = base;

}
    @Given("^User opens Chrome browser and move to the coussin page of shop meinfoto$")
    public void userOpensChromeBrowserAndMoveToTheCoussinPageOfShopMeinfoto() {
        base.Driver.navigate().to("https://www.meinfoto.de/foto-auf-heimtextilien/foto-kissen.jsf");
        base.Driver.manage().window().maximize();
    }
    @When("^User click on \"([^\"]*)\" from Coussin teaser$")
    public void userClickOnFromCoussinTeaser(String arg0) throws Throwable {
        base.Driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        CoussinPage page = new CoussinPage(base.Driver);
        page.uploadButtonCoussin.sendKeys(System.getProperty("user.dir") + "/src/main/resources/k.jpg");
    }
}
