package resourse.config;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import static com.codeborne.selenide.Selenide.*;
public class BrowserConfig {

    public void setBrowserSettings(String browser) {
        if(!browser.equals("")){
            Configuration.browser = browser;
            Configuration.driverManagerEnabled = true;
            Configuration.browserSize = "1920x1080";
            Configuration.headless = false;
        }else {
            Configuration.driverManagerEnabled = true;
            Configuration.browserSize = "1920x1080";
            Configuration.headless = true;
            String env = System.getenv("BROWSER");
            if(env.equalsIgnoreCase("chrome")){
                Configuration.browser = "chrome";
            } else if (env.equalsIgnoreCase("firefox")) {
                Configuration.browser = "firefox";
            } else if (env.equalsIgnoreCase("safari")) {
              WebDriver driver = new SafariDriver();
              WebDriverRunner.setWebDriver(driver);

            } else {
                Configuration.browser = "edge";
            }
        }
    }

    public void quitDriver(){
        closeWebDriver();
    }
}

