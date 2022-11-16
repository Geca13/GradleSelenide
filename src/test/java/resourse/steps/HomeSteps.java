package resourse.steps;

import org.example.pages.Home;
import resourse.BaseClass;

public class HomeSteps extends BaseClass {

    private Home home = new Home();

    public Boolean homePageIsLoaded(){
        return this.isDisplayed(home.getCustomersHeader());
    }
}
