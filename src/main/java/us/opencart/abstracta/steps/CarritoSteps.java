package us.opencart.abstracta.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import us.opencart.abstracta.pages.CarritoPage;

public class CarritoSteps {

    CarritoPage carrito = new CarritoPage();

    @Step("Validacion productos en carrito")
    public void validarProductosEnCarrito(){

        Assert.assertTrue(carrito.getDriver().findElement(carrito.getLnkSamsungGalaxyTab()).isDisplayed());
        Assert.assertTrue(carrito.getDriver().findElement(carrito.getLnkHTCTouchHD()).isDisplayed());

    }
    @Step("Click en Checkout")
    public void hacerClicEnCheckout(){
        carrito.getDriver().findElement(carrito.getBtnProcederAlCheckout()).click();

    }

}
