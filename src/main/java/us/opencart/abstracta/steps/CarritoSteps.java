package us.opencart.abstracta.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import us.opencart.abstracta.pages.CarritoPage;
import us.opencart.abstracta.utils.EsperaExplicita;

public class CarritoSteps {

    // Este bloque de código crea una instancia de la clase CarritoPage, que representa la página del carrito de compras en la aplicación.
    // A través de esta instancia, se pueden acceder a los métodos y elementos de la interfaz de usuario relacionados con la gestión del carrito.
    CarritoPage carrito = new CarritoPage();

    // Este metodo valida que los productos esperados estén presentes en el carrito de compras.
    /*Se utiliza la aserción para verificar que los elementos de los productos "Samsung Galaxy Tab"
     y "HTC Touch HD" sean visibles en la interfaz de usuario, lo que confirma que se han agregado correctamente al carrito. */

    @Step("Validacion productos en carrito")
    public void validarProductosEnCarrito(){
        Assert.assertTrue(carrito.getDriver().findElement(carrito.getLnkSamsungGalaxyTab()).isDisplayed());
        Assert.assertTrue(carrito.getDriver().findElement(carrito.getLnkHTCTouchHD()).isDisplayed());

    }
    @Step("Click en Checkout")
    public void hacerClicEnCheckout(){
        EsperaExplicita.esperarPorElementoClicable(carrito.getDriver(), carrito.getBtnProcederAlCheckout(), 5);
        carrito.getDriver().findElement(carrito.getBtnProcederAlCheckout()).click();

    }

}
