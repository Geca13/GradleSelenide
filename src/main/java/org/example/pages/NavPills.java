package org.example.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class NavPills {

    private SelenideElement paymentsLink = $(By.linkText("Payments"));

    private SelenideElement customersLink = $(By.linkText("Customers"));

    private SelenideElement productsLink = $(By.linkText("Products"));

    public SelenideElement getPaymentsLink() {
        return paymentsLink;
    }

    public SelenideElement getCustomersLink() {
        return customersLink;
    }

    public SelenideElement getProductsLink() {
        return productsLink;
    }
}
