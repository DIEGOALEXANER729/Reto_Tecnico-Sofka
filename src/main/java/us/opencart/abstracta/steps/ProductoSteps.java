package us.opencart.abstracta.steps;

import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import us.opencart.abstracta.pages.ProductoPage;

public class ProductoSteps {

    ProductoPage producto = new ProductoPage();

    @Step("Agregar producto al carrito")
    public void agregarProductoAlCarrito(){

        // Hacer clic en el botón "Add to Cart
        producto.getDriver().findElement(producto.getBtnAgregarAlCarrito()).click();

    }



}
