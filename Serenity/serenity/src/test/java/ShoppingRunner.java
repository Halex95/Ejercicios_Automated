@RunWith(SerenityRunner.class)
public class ShoppingRunner {

    @Managed
    WebDriver driver;

    @Steps
    ShoppingSteps user;

    @Test
    public void testE2EShoppingFlow() {
        user.opensHomePage();
        user.addsTwoProductsToCart();
        user.viewsTheCart();
        user.finalizesThePurchase();
    }
}

