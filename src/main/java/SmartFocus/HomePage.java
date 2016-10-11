package SmartFocus;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

/**
 * Created by sadha on 20/07/2016.
 */
public class HomePage extends DriverManager {
    @FindBy(xpath =".//*[@id='block-menu-block-1']/div/div/ul/li[1]/a[2]")
    public WebElement _messageCloudLink;

    @FindBy(xpath=".//*[@id='the-message-cloud']/ul/li[1]/a")
    public WebElement _personalizationEmail;


    public void _personalizationLink() {
        Actions action = new Actions(driver);
        action.moveToElement(_messageCloudLink).moveToElement(_personalizationEmail).click().build().perform();


    }


}
