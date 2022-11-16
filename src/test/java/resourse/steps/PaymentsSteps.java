package resourse.steps;

import org.example.pages.Payments;
import org.example.pages.Table;
import resourse.BaseClass;

public class PaymentsSteps extends BaseClass {

    private Payments payments = new Payments();

    public Boolean isOnPaymentsScreen(){
       return this.isDisplayed(payments.getCustomersHeader());
    }

    public String getLastPaymentValue(){
        return payments.getTableDataTextFromTableRowAndTableCell(1,2);
    }

    public String getLastPaymentCustomerEmail(){
        return payments.getTableDataTextFromTableRowAndTableCell(1,6);
    }
}
