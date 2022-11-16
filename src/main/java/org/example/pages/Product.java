package org.example.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Product {


    private SelenideElement productPrice = $(By.xpath("(//div[contains(@class, 'ProductSummary-totalAmount')]//span)[1]"));

    public SelenideElement getProductPrice() {
        return productPrice;
    }
}
