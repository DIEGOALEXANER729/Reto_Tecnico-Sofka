package us.opencart.abstracta.pages;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://opencart.abstracta.us/")
public class InicioPage extends PageObject {

    @FindBy(id = "input-payment-country")
    private WebElementFacade countryDropdown; // Dropdown para seleccionar el país

    @FindBy(id = "input-payment-zone")
    private WebElementFacade regionDropdown; // Dropdown para seleccionar la región/estado


    public void selectCountryByValue(String value) {
        countryDropdown.selectByValue(value); // Selecciona usando el valor
    }

    public void selectRegionByVisibleText(String regionName) {
        regionDropdown.selectByVisibleText(regionName); // Selecciona la región usando el texto visible
    }

    By txtBuscarInicio = By.xpath("//input[contains(@placeholder, \"Search\")]");

    By btnAddToCart = By.xpath("//button[span[text()='Add to Cart']]");

    By btnItemsCart = By.xpath("//button[@data-toggle='dropdown' and @type='button']");

    By lnkViewCart = By.xpath("//strong[contains(text(), 'View Cart')]");

    By lnkSamsungGalaxyTab = By.xpath("//table[@class='table table-bordered']//td[@class='text-left']/a[text()='Samsung Galaxy Tab 10.1']");

    By lnkHTCTouchHD = By.xpath("//table[@class='table table-bordered']//td[@class='text-left']/a[text()='HTC Touch HD']");

    By btnCheckout = By.xpath("//a[text()='Checkout']");

    By btnGuestCheckout = By.xpath("//input[@type='radio' and @name='account' and @value='guest']");

    By btnContinue = By.xpath("//input[@type='button' and @value='Continue']");

    By txtFirsName = By.xpath("//*[@placeholder=\"First Name\"]");

    By LastName = By.xpath(" //*[@placeholder=\"Last Name\"]");

    By EMail = By.xpath("//*[@id='input-payment-email']");

    By Telephone = By.xpath("//*[@id='input-payment-telephone']");

    By Company = By.xpath("//input[@placeholder=\"Company\"]");

    By Address1 = By.xpath("//*[@id='input-payment-address-1']");

    By Address2 = By.xpath("//*[@id='input-payment-address-2']");

    By City = By.xpath("//*[@id='input-payment-city']");

    By PostCode = By.xpath("//*[@id='input-payment-postcode']");

    By RegionState = By.xpath("//*[@id='input-payment-zone']");

    By btnContinue2 = By.xpath("//*[@id='button-guest']");

    By btnContinue3 = By.xpath("//*[@id='button-shipping-method']");

    By chechTerminsCondiciones = By.xpath("//*[contains(@name, \"agree\")]");

    By btnContinue4 = By.xpath("//*[@id='button-payment-method']");



    By btnConfirmOrder = By.xpath("//*[@id='button-confirm']");

    By lblOrderPlaced = By.xpath("//div[@id='content']/h1[contains(text(), 'Your order has been placed!')]");






/*
    By  btnProducto1 = By.xpath("//*[@id=\"destacados-tab\"]/div[2]/div/ul/li[2]");
    By txtUnidad = By.xpath("//*[@class=\"input-text qty text\"]");

    By btnAgregarCarrito = By.xpath("//*[@id=\"product-9543\"]/div[2]/form/button");


    By btnAgregarCarrito2 = By.xpath("//*[@class=\"single_add_to_cart_button button alt\"]");
    By btnInicioPagina = By.xpath("//*[@id=\"sticky-wrapper\"]/header/div[2]/div");

    By btnProducto2 = By.xpath("//*[@id=\"destacados-tab\"]/div[2]/div/ul/li[3]");

    By txtProducto2 = By.id("quantity_651da14e34cfe");


    public By getTxtBuscarInicio() {
        return txtBuscarInicio;
    }

    public By getBtnProducto1() {
        return btnProducto1;
    }

    public By getTxtUnidad() {
        return txtUnidad;
    }

    public By getBtnAgregarCarrito() {
        return btnAgregarCarrito;
    }

    public By getBtnInicioPagina() {
        return btnInicioPagina;
    }

    public By getBtnProducto2() {
        return btnProducto2;
    }

    public By getTxtProducto2() {
        return txtProducto2;
    }

    public By getBtnAgregarCarrito2() {
        return btnAgregarCarrito2;
    }

 */

    public By getBtnAddToCart() {
        return btnAddToCart;
    }

    public By getTxtBuscarInicio() {
        return txtBuscarInicio;
    }

    public By getBtnItemsCart() {
        return btnItemsCart;
    }

    public By getLnkViewCart() {
        return lnkViewCart;
    }

    public By getLnkSamsungGalaxyTab() {
        return lnkSamsungGalaxyTab;
    }

    public By getLnkHTCTouchHD() {
        return lnkHTCTouchHD;
    }

    public By getBtnCheckout() {
        return btnCheckout;
    }

    public By getBtnGuestCheckout() {
        return btnGuestCheckout;
    }

    public By getBtnContinue() {
        return btnContinue;
    }

    public By getTxtFirsName() {
        return txtFirsName;
    }

    public By getLastName() {
        return LastName;
    }

    public By getEMail() {
        return EMail;
    }

    public By getTelephone() {
        return Telephone;
    }

    public By getCompany() {
        return Company;
    }

    public By getAddress1() {
        return Address1;
    }

    public By getAddress2() {
        return Address2;
    }

    public By getCity() {
        return City;
    }

    public By getPostCode() {
        return PostCode;
    }



    public By getRegionState() {
        return RegionState;
    }

    public By getBtnContinue2() {
        return btnContinue2;
    }

    public By getBtnContinue3() {
        return btnContinue3;
    }

    public By getChechTerminsCondiciones() {
        return chechTerminsCondiciones;
    }

    public By getBtnContinue4() {
        return btnContinue4;
    }

    public By getBtnConfirmOrder() {
        return btnConfirmOrder;
    }

    public By getLblOrderPlaced() {
        return lblOrderPlaced;
    }
}
