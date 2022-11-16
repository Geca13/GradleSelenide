package resourse.steps;

import org.example.pages.Products;
import resourse.BaseClass;

public class ProductsSteps extends BaseClass {

    private Products products = new Products();

    public Boolean isOnProductsScreen(){
        return this.isDisplayed(products.getProductsHeader());
    }

    public String getLastProductDetails(){
        return products.getTableDataTextFromTableRowAndTableCell(1,2);
    }
}
