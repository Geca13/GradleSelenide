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

    private AdminLoginSteps adminLogin = new AdminLoginSteps();

    private PaymentsSteps paymentsSteps = new PaymentsSteps();

    private CustomersSteps customersSteps = new CustomersSteps();

    private ProductsSteps productsSteps = new ProductsSteps();

    private HomeSteps homeSteps = new HomeSteps();

    private NavPillsSteps pillsSteps = new NavPillsSteps();

    private static String BASE = "";

    @BeforeAll
    public static void getNameIdentifier(){
       BASE = RandomStringUtils.random(5, true, false);
    }

    @BeforeEach
    public void setup(){
        config.setBrowserSettings("chrome");
    }

    @AfterEach
    public void tearDown(){
        config.quitDriver();
    }


    @Test
    @Order(1)
    public void test1() throws InterruptedException {

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
        Thread.sleep(10000);
        assertTrue(confirmation.thankYouMessageIsDisplayed());
        String paid = confirmation.getPaidValue();
        assertEquals(paid, product.getProductPrice());

    }

    @Test
    @Order(2)
    public void test2(){

        adminLogin.openAdminPage();
        assertTrue(adminLogin.loginPageIsLoaded());
        System.out.println("On Login Screen");
        adminLogin.loginWithValidCredentials();
        assertTrue(homeSteps.homePageIsLoaded());
        System.out.println("Logged in");
        pillsSteps.clickCustomersNav();
        assertTrue(customersSteps.isOnCustomersScreen());
        assertEquals(customersSteps.getLastCustomerEmail(), BASE+"@marjan.com");
        assertEquals(customersSteps.getLastCustomerFullName(), "Marjan "+BASE);

    }

    @Test
    @Order(3)
    public void test3(){

        adminLogin.openAdminPage();
        assertTrue(adminLogin.loginPageIsLoaded());
        adminLogin.loginWithValidCredentials();
        assertTrue(homeSteps.homePageIsLoaded());
        pillsSteps.clickPaymentsNav();
        assertTrue(paymentsSteps.isOnPaymentsScreen());
        assertEquals(paymentsSteps.getLastPaymentValue(), "$100.00");
        assertEquals(paymentsSteps.getLastPaymentCustomerEmail(), BASE+"@marjan.com");

    }

    @Test
    @Order(4)
    public void test4(){

        adminLogin.openAdminPage();
        assertTrue(adminLogin.loginPageIsLoaded());
        adminLogin.loginWithValidCredentials();
        assertTrue(homeSteps.homePageIsLoaded());
        pillsSteps.clickProductsNav();
        assertTrue(productsSteps.isOnProductsScreen());
        System.out.println(productsSteps.getLastProductDetails());
        //assertEquals(paymentsSteps.getLastPaymentValue(), "$100.00");
        //assertEquals(paymentsSteps.getLastPaymentCustomerEmail(), "gec@mec1.com");

    }


}
