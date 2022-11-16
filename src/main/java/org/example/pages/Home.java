package org.example.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Home {

    private SelenideElement homeHeader = $(By.xpath("//span[text()='Activate payments on your account']"));

    public SelenideElement getCustomersHeader() {
        return homeHeader;
    }
}
