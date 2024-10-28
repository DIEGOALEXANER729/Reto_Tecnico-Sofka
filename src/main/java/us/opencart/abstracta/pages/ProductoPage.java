package us.opencart.abstracta.pages;

import org.openqa.selenium.By;
import net.serenitybdd.core.pages.PageObject;

public class ProductoPage extends PageObject {

    // Este bloque de código define un elemento de la interfaz de usuario que representa el botón para agregar un producto al carrito de compras.
    // También incluye un metodo que permite acceder a este botón, facilitando la interacción con el mismo durante las pruebas automatizadas.

    By btnAgregarAlCarrito = By.xpath("//button[span[text()='Add to Cart']]");

    public By getBtnAgregarAlCarrito() {
        return btnAgregarAlCarrito;
    }

}
