public class PurchaseFlow {
    public static Task addTwoProducts() {
        return Task.where("{0} adds two products to the cart",
                Click.on(ShoppingPage.ADD_TO_CART),
                Click.on(ShoppingPage.ADD_TO_CART));
    }
    
    public static Task finalizePurchase() {
        return Task.where("{0} finalizes the purchase",
                Click.on(ShoppingPage.PLACE_ORDER));
    }
}
