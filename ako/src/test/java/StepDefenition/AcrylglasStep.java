package StepDefenition;

import Base.BaseUtil;
import Pages.Acrylglas.AcrylglasPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

import java.util.concurrent.TimeUnit;


public class AcrylglasStep extends BaseUtil {

        private BaseUtil base;
        public AcrylglasStep(BaseUtil base) {
            this.base = base;
        }
    @Given("^User opens Chrome browser and move to the acrylglas page of shop meinfoto$")
    public void userOpensChromeBrowserAndMoveToTheAcrylglasPageOfShopMeinfoto() {
        base.Driver.navigate().to("https://www.meinfoto.de/foto-in-gross/foto-hinter-acrylglas.jsf");
        base.Driver.manage().window().maximize();
    }

        @When("^User click on \"([^\"]*)\" from Acryglas teaser$")
        public void userClickOnFromAcryglasTeaser(String arg0) throws InterruptedException {
         base.Driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
         AcrylglasPage page = new AcrylglasPage(base.Driver);
         page.uploadButtonAcrylglas.sendKeys(System.getProperty("user.dir") + "/src/main/resources/k.jpg");
        }
}
