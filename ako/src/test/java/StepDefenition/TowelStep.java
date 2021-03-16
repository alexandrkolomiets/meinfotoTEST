package StepDefenition;

import Base.BaseUtil;
import Pages.Towel.TowelPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

import java.util.concurrent.TimeUnit;

public class TowelStep extends BaseUtil {

    private BaseUtil base;
    public TowelStep(BaseUtil base) {
        this.base = base;

    }
    @Given("^User opens Chrome browser and move to the Towel page of shop meinfoto$")
    public void userOpensChromeBrowserAndMoveToTheTowelPageOfShopMeinfoto() {
        base.Driver.navigate().to("https://www.meinfoto.de/foto-auf-heimtextilien/foto-handtuch.jsf");
        base.Driver.manage().window().maximize();
    }

    @When("^User click on \"([^\"]*)\" from Towel teaser$")
    public void userClickOnFromTowelTeaser(String arg0)  throws Throwable {
        base.Driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        TowelPage page = new TowelPage(base.Driver);
        page.uploadButtonTowel.sendKeys(System.getProperty("user.dir") + "/src/main/resources/k.jpg");
    }
}