package Pages;

import Utils.Browser;
import org.openqa.selenium.support.PageFactory;

public class FrontPage extends BasePage {

    static {
        PageFactory.initElements(Browser.driver,FrontPage.class);
    }

    public static String url = "https://www.mobile.bg/pcgi/mobile.cgi";

    public static void goToFrontPage(){
        Browser.driver.get(url);

    }

}
