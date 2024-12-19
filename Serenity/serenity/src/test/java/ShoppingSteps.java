public class ShoppingSteps {

    ShoppingPage shoppingPage;

    @Step
    public void opensHomePage() {
        shoppingPage.open();
    }

    @Step
    public void addsTwoProductsToCart() {
        shoppingPage.addProductToCart();
    }

    @Step
    public void viewsTheCart() {
        shoppingPage.openCart();
    }

    @Step
    public void finalizesThePurchase() {
        shoppingPage.completeFormAndSubmit();
    }
}

