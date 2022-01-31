import Pages.FrontPage;
import Pages.MobileSearch;
import org.testng.annotations.Test;

public class MobileSearchTest extends BaseTest{

    @Test
    public void MobileTest(){
        MobileSearch.popUpWindow();
        MobileSearch.searchByTypeOfCar("Автомобили и Джипове");
        MobileSearch.searchByBrandOfCar("Honda");
        MobileSearch.searchByModelOfCar("Civic");
        MobileSearch.pressSearchButton();

    }
}
