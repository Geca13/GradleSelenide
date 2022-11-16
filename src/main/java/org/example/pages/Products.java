package org.example.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Products extends Table{

    private SelenideElement productsHeader = $(By.xpath("//span[text()='Products']"));

    public SelenideElement getProductsHeader() {
        return productsHeader;
    }
}
