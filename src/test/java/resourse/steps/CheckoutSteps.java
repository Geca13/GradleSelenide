package resourse.steps;

import org.example.pages.Checkout;
import org.example.urls.Url;
import resourse.BaseClass;

public class CheckoutSteps extends BaseClass {

    private Checkout checkout = new Checkout();

    private Url url = new Url();

    public void navigateTo100ProductStripePage(){
        this.navigateTo(url.getPaymentUrl100());
    }

    public Boolean checkoutButtonIsDisplayed(){
        return this.isDisplayed(checkout.getCheckoutBtn());
    }

    public void fillCardNumberInputWithValidNumber(){
        this.sendKeysToInput(checkout.getCardInput(), "4242424242424242");
    }

    public void fillCardNumberInputWithInvalidNumber(){
        this.sendKeysToInput(checkout.getCardInput(), "1234567890123456");
    }

    public void fillExpirationInputWithValidDate(){
        this.sendKeysToInput(checkout.getExpirationInput(), "1123");
    }

    public void fillExpirationInputWithInvalidDate(){
        this.sendKeysToInput(checkout.getExpirationInput(), "1121");
    }

    public void fillCvcInputWithValidNumber(){
        this.sendKeysToInput(checkout.getCvcInput(), "112");
    }

    public void fillNameInputWithCardholderName(String base){
        this.sendKeysToInput(checkout.getNameInput(), "Marjan " + base);
    }

    public void fillEmailInputWithValidEmail(String base){
        this.sendKeysToInput(checkout.getEmailInput(), base+"@marjan.com");
    }

    public void fillEmailInputWithInvalidEmail(){
        this.sendKeysToInput(checkout.getEmailInput(), "1121");
    }

    public void fillCountrySelectWithValidCountry(){
        this.sendKeysToInput(checkout.getCountrySelect(), "Germany");
    }

    public void clickCheckoutButton(){
        this.clickElement(checkout.getCheckoutBtn());
    }


}
