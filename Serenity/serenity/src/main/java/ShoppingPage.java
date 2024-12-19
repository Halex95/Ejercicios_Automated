public class ShoppingPage extends PageObject {
    
        @FindBy(xpath = "//a[text()='Add to cart']")
        private WebElementFacade addToCart;
    
        @FindBy(id = "cartur")
        private WebElementFacade viewCart;
    
        @FindBy(xpath = "//button[text()='Place Order']")
        private WebElementFacade placeOrder;
    
        public void addProductToCart() {
            addToCart.click();
            getDriver().switchTo().alert().accept();
        }
    
        public void openCart() {
            viewCart.click();
        }
}
