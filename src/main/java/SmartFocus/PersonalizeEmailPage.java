package SmartFocus;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;


/**
 * Created by sadha on 20/07/2016.
 */
public class PersonalizeEmailPage extends  DriverManager{
    @FindBy (css=".message-cloud-signpposts__headline")
    public WebElement _email;


    public boolean  emailVerify(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        boolean display = _email.isDisplayed();
        System.out.println(display);

        return display;
    }

}
