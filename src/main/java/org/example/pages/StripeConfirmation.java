package org.example.pages;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

public class StripeConfirmation {

    private SelenideElement thanksMessage = $(By.xpath("//span[contains(@class, 'Text-fontSize--20')]"));

    private SelenideElement valuePaid = $(By.xpath("//span[contains(@class, 'Text-fontSize--14')]//span"));

    public SelenideElement getThanksMessage() {
        return thanksMessage;
    }

    public SelenideElement getValuePaid() {
        return valuePaid;
    }
}
