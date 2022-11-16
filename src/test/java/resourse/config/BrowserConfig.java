package resourse.config;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Selenide.*;
public class BrowserConfig {

    public void setBrowserSettings(String browser){
        Configuration.browser = browser;
        Configuration.driverManagerEnabled = true;
        Configuration.browserSize = "1920x1080";
        Configuration.headless = true;
    }

    public void quitDriver(){
        closeWebDriver();
    }
}
