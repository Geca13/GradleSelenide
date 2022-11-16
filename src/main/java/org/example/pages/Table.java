package org.example.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Table {


    private SelenideElement getTableData(Integer tableRow, Integer tableData) {
        return $(By.xpath("(//tbody//tr)[" + tableRow + "]//td[" + tableData + "]"));
    }

    public String getTableDataTextFromTableRowAndTableCell(Integer tableRow, Integer tableData){
        return this.getTableData(tableRow,tableData).getText();
    }




}
