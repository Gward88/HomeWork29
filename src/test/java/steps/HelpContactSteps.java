package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.lexer.He;
import org.testng.Assert;
import pages.actions.HelpAndContactActions;
import pages.actions.HomePageActions;
import utils.SeleniumDriver;

public class HelpContactSteps {
    HomePageActions homePageActions = new HomePageActions();
    HelpAndContactActions helpAndContactActions = new HelpAndContactActions();

    @When("^I am open to Help&Contact$")
    public void iAmOpenToHelpContact() {
        homePageActions.clickOnHelpAndContactButton();
    }


    @And("^click on account button$")
    public void clickOnAccountButton() {
        helpAndContactActions.clickOnHelpAndContactButton();
    }

    @Then("^I should get title of the page\"([^\"]*)\"$")
    public void iShouldGetTitleOfThePage(String expectedTitle) throws Throwable {
        String actualPageTitle = SeleniumDriver.getDriver().getTitle();
        Assert.assertEquals(actualPageTitle,expectedTitle);
    }
}
