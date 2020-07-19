package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePageLocators {

    @FindBy(how= How.LINK_TEXT, using = "Electronics")
    public WebElement electronicsLink;

    @FindBy(how= How.LINK_TEXT, using = "Help & Contact")
    public WebElement helpAndContactLink;


    @FindBy(how = How.LINK_TEXT, using = "Camera Drones")
    public WebElement cameraDronesMenuLink;

    @FindBy(how = How.LINK_TEXT, using = "Advanced")
    public WebElement advancedLink;

    @FindBy(xpath = "//*[@id=\"mainContent\"]/div[1]/ul/li[3]/div[2]/div[1]/div[2]/ul/li[2]/a")
    public WebElement samsungButton;
}
