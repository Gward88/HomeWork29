package steps;

import cucumber.api.java.en.And;
import pages.actions.HomePageActions;
import pages.actions.SamsungPageActions;

public class SamsungSteps {
    HomePageActions homePageActions = new HomePageActions();
    SamsungPageActions samsungPageActions = new SamsungPageActions();

    @And("^I am click to samsung Menu$")
    public void iAmClickToSamsungMenu() {
        homePageActions.clickOnSamsungButton();
    }

    @And("^I am click to See All$")
    public void iAmClickToSeeAll() {
        samsungPageActions.clickToSeeAllByShopNetwork();
    }
}
