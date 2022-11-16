package org.example.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Payments extends Table {

    private SelenideElement customersHeader = $(By.xpath("//span[text()='Payments']"));

    public SelenideElement getCustomersHeader() {
        return customersHeader;
    }
}
