package SmartFocus;

import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.io.IOException;

/**
 * Created by sadha on 20/07/2016.
 */
public class Hook {
    DriverManager driverManager = new DriverManager();
    @Before

    public void setUp() throws IOException {
        driverManager.OpenBrowser();
    }
    @After
    public void tearDown() {
        driverManager.closeBrowser();
    }
}
