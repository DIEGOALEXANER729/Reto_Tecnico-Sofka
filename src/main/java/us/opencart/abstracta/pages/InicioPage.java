package us.opencart.abstracta.pages;



import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://opencart.abstracta.us/")
public class InicioPage extends PageObject {

    // Este bloque de código define elementos de la interfaz de usuario relacionados con la búsqueda de productos y la gestión del carrito de compras.
    // Incluye un campo de búsqueda para encontrar productos, un enlace para visualizar el carrito y un botón para acceder a los ítems del carrito.

    By txtCampoBusqueda = By.xpath("//input[contains(@placeholder, \"Search\")]");

    By lnkVerCarrito = By.xpath("//strong[contains(text(), 'View Cart')]");

    By btnItemsDelCarrito = By.xpath("//button[@data-toggle='dropdown' and @type='button']");

    // Este bloque de código contiene métodos que permiten acceder a los elementos de la interfaz de usuario relacionados con la búsqueda y el carrito de compras.
    // Facilita la interacción con el campo de búsqueda, el botón para los ítems del carrito y el enlace para visualizar el carrito, siguiendo el patrón de diseño Page Object Model.

    public By getTxtCampoBusqueda() {
        return txtCampoBusqueda;
    }

    public By getBtnItemsDelCarrito() {
        return btnItemsDelCarrito;
    }

    public By getLnkVerCarrito() {
        return lnkVerCarrito;
    }


}
