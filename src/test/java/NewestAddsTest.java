import Pages.MobileSearch;
import Pages.NewestAdds;
import org.testng.annotations.Test;

public class NewestAddsTest extends BaseTest{

    @Test
    public void NewestAdds(){
        MobileSearch.popUpWindow();
        NewestAdds.pressDetailedSearch();
        NewestAdds.searchByNewestAdds("Най-новите обяви от посл. 2 дни");
        NewestAdds.pressSearchButton();
    }
}
