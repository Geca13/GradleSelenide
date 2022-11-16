package resourse.steps;

import org.example.pages.Customers;
import resourse.BaseClass;

public class CustomersSteps extends BaseClass {

    private Customers customers = new Customers();

    public Boolean isOnCustomersScreen(){
        return this.isDisplayed(customers.getCustomersHeader());
    }

    public String getLastCustomerEmail(){
        return customers.getTableDataTextFromTableRowAndTableCell(1,4);
    }

    public String getLastCustomerFullName(){
        return customers.getTableDataTextFromTableRowAndTableCell(1,2);
    }
}
