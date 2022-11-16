package resourse.steps;

import org.example.pages.AdminLogin;
import org.example.urls.Url;
import resourse.BaseClass;

public class AdminLoginSteps extends BaseClass {

    private Url url = new Url();

    private AdminLogin adminLogin = new AdminLogin();

    public void openAdminPage(){
        this.navigateTo(url.getLoginUrl());

    }

    public Boolean loginPageIsLoaded(){
       return this.isDisplayed(adminLogin.getContinueButton());
    }

    public void loginWithValidCredentials(){
        this.sendKeysToInput(adminLogin.getEmailInput(), "marjan.karafiloski@scalefocus.com");
        this.sendKeysToInput(adminLogin.getPasswordInput(), "FNTStripe13");
        this.clickElement(adminLogin.getContinueButton());
    }

}
