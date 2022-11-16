package org.example.pages;
import static com.codeborne.selenide.Selenide.*;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public class Index {

    public SelenideElement get100Link(){
        return $(By.id("link100"));
    };
}
