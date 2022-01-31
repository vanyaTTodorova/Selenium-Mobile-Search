import Utils.Browser;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


    public abstract class BaseTest {

        @BeforeMethod
        protected static void setupBrowser() {
            Browser.setUp();
        }

//        @AfterMethod
//        protected static void quitBrowser(){
//            Browser.quitBrowser();
//        }
   }


