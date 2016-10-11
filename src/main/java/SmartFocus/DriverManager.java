package SmartFocus;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.InternetExplorerDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

/**
 * Created by sadha on 19/07/2016.
 */
public class DriverManager {
    public static WebDriver driver;
    public DriverManager() {
        PageFactory.initElements(driver,this);
    }
    public void OpenBrowser() throws IOException {
        Properties properties = new Properties();

FileInputStream fileInputStream = new FileInputStream("C:\\Backup\\smartFocus\\src\\test\\resources\\config.properties");
        //  System.out.println(System.getProperties("user.dir"));
        properties.load(fileInputStream);
        String url = properties.getProperty("url");
        String browser = properties.getProperty("browser");
        if (browser.equalsIgnoreCase("firefox")){
            driver = new FirefoxDriver();
        }
        else if  (browser.equalsIgnoreCase("chrome")){
            ChromeDriverManager.getInstance().setup();
            driver = new ChromeDriver();
        }
        else if (browser.contains("Internet Explorer")){
            InternetExplorerDriverManager.getInstance().setup();
            driver = new InternetExplorerDriver();

        }
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    public void closeBrowser(){
        driver.quit();



    }
}

