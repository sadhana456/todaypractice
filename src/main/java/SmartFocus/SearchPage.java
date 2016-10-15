package SmartFocus;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by sadha on 20/07/2016.
 */
public class SearchPage extends DriverManager {
    @FindBy(css="#sb_ifc0")
    public WebElement _search;
    @FindBy(id="sblsbb")
    public WebElement _searchLink;
	/**sandeep comment**/
    public void search(String name ){
        _search.sendKeys(name);
    }
    public void searchClick(){
        _searchLink.click();
    }

    @FindBy(css=".r>a")
    public WebElement _smartLink;

    public void smart(){
        _smartLink.click();
    }



}
