package Pages;

import Utils.Browser;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Iterator;
import java.util.Set;

public class MobileSearch extends BasePage{

    static {
        PageFactory.initElements(Browser.driver,MobileSearch.class);
    }
    @FindBy(xpath = "/html/body/div[3]/div[2]/div[1]/div[2]/div[2]/button[1]/p")
    private static WebElement popUp;

    @FindBy(xpath = "//*[@id=\"blocksrc\"]/form/table/tbody/tr[1]/td/table/tbody/tr[2]/td/select")
    private static WebElement typeOfCar;

    @FindBy(xpath = "//*[@id=\"cat5\"]/select")
    private static WebElement brand;

    @FindBy(xpath = "//*[@id=\"cat7\"]/select")
    private static WebElement model;

    @FindBy(xpath = "//*[@id=\"button2\"]")
    private static WebElement searchButton;

    public static void popUpWindow() {
        FrontPage.goToFrontPage();
        popUp.click();

    }

    public static void searchByTypeOfCar(String text){
        Select typeOfCarDpd = new Select(typeOfCar);
        typeOfCarDpd.selectByVisibleText(text);
    }
    public static void searchByBrandOfCar(String text){
        Select brandOfCarDpd = new Select(brand);
        brandOfCarDpd.selectByVisibleText(text);
    }
    public static void searchByModelOfCar(String text){
        Select modelOfCarDpd = new Select(model);
        modelOfCarDpd.selectByVisibleText(text);
    }
    public static void pressSearchButton(){
        searchButton.click();
    }
}



