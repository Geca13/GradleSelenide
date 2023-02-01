package resourse.tests;

import static org.junit.jupiter.api.Assertions.*;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.*;
import resourse.config.BrowserConfig;
import resourse.steps.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class StripeTests {

    private CheckoutSteps checkout = new CheckoutSteps();

    private ProductSteps product = new ProductSteps();

    private ConfirmationSteps confirmation = new ConfirmationSteps();

    private BrowserConfig config = new BrowserConfig();

    private static String BASE = "";

    @BeforeAll
    public static void getNameIdentifier(){
       BASE = RandomStringUtils.random(5, true, false);
    }

    @BeforeEach
    public void setup(){
        config.setBrowserSettings("");
    }

    @AfterEach
    public void tearDown(){
        config.quitDriver();
    }


    @Test
    @Order(1)
    public void test1() throws InterruptedException {
        System.out.println("Test Started");
        checkout.navigateTo100ProductStripePage();
        assertTrue(checkout.checkoutButtonIsDisplayed());
        checkout.fillEmailInputWithValidEmail(BASE);
        Thread.sleep(500);
        checkout.fillCardNumberInputWithValidNumber();
        Thread.sleep(500);
        checkout.fillExpirationInputWithValidDate();
        Thread.sleep(500);
        checkout.fillCvcInputWithValidNumber();
        Thread.sleep(500);
        checkout.fillNameInputWithCardholderName(BASE);
        Thread.sleep(500);
        checkout.fillCountrySelectWithValidCountry();
        Thread.sleep(500);
        checkout.clickCheckoutButton();
        Thread.sleep(50000);
        assertTrue(confirmation.thankYouMessageIsDisplayed());
        String paid = confirmation.getPaidValue();
        assertEquals(paid, product.getProductPrice());
        System.out.println("Test Completed");
    }


}

