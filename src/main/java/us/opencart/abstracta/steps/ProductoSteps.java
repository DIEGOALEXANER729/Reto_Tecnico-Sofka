package us.opencart.abstracta.steps;

import net.thucydides.core.annotations.Step;
import us.opencart.abstracta.pages.ProductoPage;

public class ProductoSteps {

    /*
       Esta clase contiene los pasos relacionados con las interacciones
       con los productos, incluyendo la adición de productos al carrito
       de compras. Facilita la automatización de acciones específicas
       en la página de productos.
    */

    ProductoPage producto = new ProductoPage();

    @Step("Agregar producto al carrito")
    public void agregarProductoAlCarrito(){

        // Hacer clic en el botón "Add to Cart
        producto.getDriver().findElement(producto.getBtnAgregarAlCarrito()).click();

    }



}
