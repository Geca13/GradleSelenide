package resourse.steps;

import org.example.pages.NavPills;
import resourse.BaseClass;

public class NavPillsSteps extends BaseClass {
    NavPills nav = new NavPills();

    public void clickPaymentsNav(){
        this.clickElement(nav.getPaymentsLink());
    }

    public void clickProductsNav(){
        this.clickElement(nav.getProductsLink());
    }

    public void clickCustomersNav(){
        this.clickElement(nav.getCustomersLink());
    }
}
