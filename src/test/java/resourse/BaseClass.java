package resourse;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class BaseClass {

    public void navigateTo(String url){
        open(url);
    }

    public Boolean isDisplayed(SelenideElement element){
        element.shouldBe(visible, Duration.ofSeconds(10));
        if(element.exists() == true){
            return true;
        }else {
            return false;
        }
    }

    public String getElementText(SelenideElement element){
        return element.getText();
    }

    public void clickElement(SelenideElement element){
        element.click();
    }

    public void sendKeysToInput(SelenideElement element, String keys){
        element.sendKeys(keys);
    }


    }
