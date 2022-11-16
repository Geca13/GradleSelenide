package resourse.steps;

import org.example.pages.Product;
import resourse.BaseClass;

public class ProductSteps extends BaseClass {

    private Product product = new Product();

    public String getProductPrice(){
        return this.getElementText(product.getProductPrice());
    }
}
