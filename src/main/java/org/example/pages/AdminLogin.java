package org.example.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class AdminLogin {

    private SelenideElement emailInput = $(By.id("email"));

    private SelenideElement passwordInput = $(By.id("old-password"));

    private SelenideElement continueButton = $(By.xpath("//button[@type='submit']"));

    public SelenideElement getEmailInput() {
        return emailInput;
    }

    public SelenideElement getPasswordInput() {
        return passwordInput;
    }

    public SelenideElement getContinueButton() {
        return continueButton;
    }
}
