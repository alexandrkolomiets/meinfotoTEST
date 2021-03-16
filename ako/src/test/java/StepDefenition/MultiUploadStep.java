package StepDefenition;

import Base.BaseUtil;
import Pages.MultiUpload.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import java.util.concurrent.TimeUnit;

public class MultiUploadStep extends BaseUtil {


    private BaseUtil base;

    public MultiUploadStep(BaseUtil base) {
        this.base = base;

    }


    @Given("^User opens Chrome browse and move to multiupload page$")
    public void userOpensChromeBrowseAndMoveToMultiuploadPage() {
        base.Driver.navigate().to("https://test:karneval2@testing.meinfoto.de/index-multi/");
        base.Driver.manage().window().maximize();
    }

    @When("^User makes \"([^\"]*)\"$")
    public void userMakes(String arg0){
        MultiUploadPage page = new MultiUploadPage(base.Driver);
        page.CtaButton.sendKeys(System.getProperty("user.dir") + "/src/main/resources/k2.jpg");
    }

    @Then("^User will be moved on multi upload configurator page$")
    public void userWillBeMovedOnMultiUploadConfiguratorPage() {
    }

    @And("^User clicks  \"([^\"]*)\"$")
    public void userClicks(String arg0) {
        base.Driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        MultiUploadConfigPage page = new MultiUploadConfigPage(base.Driver);
        page.ClickButton.click();
        base.Driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        page.Confirm.click();
    }
}
