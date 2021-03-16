package StepDefenition;

import Base.BaseUtil;
import Pages.Starmap.StarmapPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class StarmapStep extends BaseUtil {
    private BaseUtil base;
    public StarmapStep(BaseUtil base){
        this.base=base;
    }
    @Given("^User opens Chrome browser and move to the Starmap page of shop meinfoto$")
    public void userOpensChromeBrowserAndMoveToTheStarmapPageOfShopMeinfoto() {
        base.Driver.navigate().to("https://www.meinfoto.de/foto-geschenke/sternenhimmel.jsf");
        base.Driver.manage().window().maximize();
    }
    @When("^User click on \"([^\"]*)\" from Starmap teaser$")
    public void userClickOnFromStarmapTeaser(String arg0)  throws InterruptedException {
        base.Driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        StarmapPage page = new StarmapPage(base.Driver);
        page.uploadButtonStarmap.click();
    }

    @And("^User is available to choose needed \"([^\"]*)\" on StarMap configurator$")
    public void userIsAvailableToChooseNeededOnStarMapConfigurator(String arg0) throws Throwable {
        StarmapPage page = new StarmapPage(base.Driver);
        Actions actions = new Actions(base.Driver);
        actions.moveToElement(page.configuratorButton);
        actions.perform();
        page.configuratorButton.click();
    }
}
