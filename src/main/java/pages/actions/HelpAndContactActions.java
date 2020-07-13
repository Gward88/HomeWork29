package pages.actions;

import org.openqa.selenium.support.PageFactory;
import pages.locators.ElectronicsPageLocators;
import pages.locators.HelpAndContactLocators;
import pages.locators.HomePageLocators;
import utils.SeleniumDriver;

public class HelpAndContactActions {
    HelpAndContactLocators helpAndContactLocators = null;

    public HelpAndContactActions(){
        this.helpAndContactLocators = new HelpAndContactLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(), helpAndContactLocators);
    }

    public void clickOnHelpAndContactButton() {
        helpAndContactLocators.accountButton.click();
    }
}
