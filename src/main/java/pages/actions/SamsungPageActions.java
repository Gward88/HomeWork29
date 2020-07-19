package pages.actions;

import org.openqa.selenium.support.PageFactory;
import pages.locators.HelpAndContactLocators;
import pages.locators.SamsungPageLocators;
import utils.SeleniumDriver;

public class SamsungPageActions {
    SamsungPageLocators samsungPageLocators = null;

    public SamsungPageActions(){
        this.samsungPageLocators = new SamsungPageLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(), samsungPageLocators);
    }
    public void clickToSeeAllByShopNetwork(){
        samsungPageLocators.seeAllButtonInShopByNetwork.click();
    }
}
