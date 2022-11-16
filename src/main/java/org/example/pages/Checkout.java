package org.example.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Checkout {

    private SelenideElement productPrice = $(By.xpath("(//div[contains(@class, 'ProductSummaryTotalAmount')]//span)[1]"));

    private SelenideElement checkoutBtn = $(By.className("SubmitButton-IconContainer"));

    private SelenideElement emailInput = $(By.id("email"));

    private SelenideElement cardInput = $(By.id("cardNumber"));

    private SelenideElement expirationInput = $(By.id("cardExpiry"));

    private SelenideElement cvcInput = $(By.id("cardCvc"));

    private SelenideElement nameInput = $(By.id("billingName"));

    private SelenideElement countrySelect = $(By.id("billingCountry"));

    public SelenideElement getProductPrice() {
        return productPrice;
    }

    public SelenideElement getCheckoutBtn() {
        return checkoutBtn;
    }

    public SelenideElement getEmailInput() {
        return emailInput;
    }

    public SelenideElement getCardInput() {
        return cardInput;
    }

    public SelenideElement getExpirationInput() {
        return expirationInput;
    }

    public SelenideElement getCvcInput() {
        return cvcInput;
    }

    public SelenideElement getNameInput() {
        return nameInput;
    }

    public SelenideElement getCountrySelect() {
        return countrySelect;
    }
}
