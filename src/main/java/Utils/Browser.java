package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Browser {

    public static WebDriver driver;

    public static void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vili\\webdrivers\\NewWebdriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
//    public static void quitBrowser(){
//        driver.quit();
//    }
}
