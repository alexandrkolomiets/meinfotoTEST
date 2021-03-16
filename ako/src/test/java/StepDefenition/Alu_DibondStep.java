package StepDefenition;

import Base.BaseUtil;
import Pages.Alu_Dibond.Alu_DibondPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

import java.util.concurrent.TimeUnit;

public class Alu_DibondStep extends BaseUtil {
    private BaseUtil base;
    public Alu_DibondStep(BaseUtil base) {
        this.base = base;
    }

    @Given("^User opens Chrome browser and move to the Alu_Dibond page of shop meinfoto$")
    public void userOpensChromeBrowserAndMoveToTheAlu_DibondPageOfShopMeinfoto() {
        base.Driver.navigate().to("https://www.meinfoto.de/foto-in-gross/foto-auf-alu-dibond.jsf");
        base.Driver.manage().window().maximize();

    }

    @When("^User click on \"([^\"]*)\" from Alu_Dibond teaser$")
    public void userClickOnFromAlu_DibondTeaser(String arg0) throws Throwable {
        base.Driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Alu_DibondPage page = new Alu_DibondPage(base.Driver);
        page.uploadButtonAluDibond.sendKeys(System.getProperty("user.dir") + "/src/main/resources/k.jpg");
    }
}
