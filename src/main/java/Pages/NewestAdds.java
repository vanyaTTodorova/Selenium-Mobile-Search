package Pages;

import Utils.Browser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class NewestAdds extends BasePage {

    static {
        PageFactory.initElements(Browser.driver, NewestAdds.class);
    }

    @FindBy(xpath = "//*[@id=\"blocksrc\"]/form/table/tbody/tr[7]/td[3]/a/strong")
    private static WebElement detailedSearch;

    @FindBy(xpath = "//*[@id=\"mainholder\"]/form/table/tbody/tr/td/table[3]/tbody/tr[3]/td[9]/select")
    private static WebElement filterSearch;

    @FindBy(xpath = "//*[@id=\"mainholder\"]/form/table/tbody/tr/td/table[2]/tbody/tr[1]/td[7]/input")
    private static WebElement searchButton;


    public static void pressDetailedSearch(){
        detailedSearch.click();
    }
    public static void searchByNewestAdds(String text) {
        Select filterDpd = new Select(filterSearch);
        filterDpd.selectByVisibleText(text);
    }
    public static void pressSearchButton(){
        searchButton.click();
    }
}
