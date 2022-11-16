package resourse.steps;

import org.example.pages.StripeConfirmation;
import resourse.BaseClass;

public class ConfirmationSteps extends BaseClass {

    private StripeConfirmation confirmation = new StripeConfirmation();

    public Boolean thankYouMessageIsDisplayed(){
        return this.isDisplayed(confirmation.getThanksMessage());
    }

    public String getPaidValue(){
        return this.getElementText(confirmation.getValuePaid());
    }

}
