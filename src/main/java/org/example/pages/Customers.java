package org.example.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Customers extends Table{

    private SelenideElement customersHeader = $(By.xpath("//span[text()='Customers']"));

    public SelenideElement getCustomersHeader() {
        return customersHeader;
    }
}
