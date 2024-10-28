package us.opencart.abstracta.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class OrdenSatisfactoriaPage extends PageObject {

    // Este bloque de código define un elemento de la interfaz de usuario que muestra un mensaje de confirmación de pedido realizado con éxito.
    // Además, incluye un metodo que permite acceder a este elemento, facilitando la verificación de que la orden se ha completado correctamente.

    By lblOrdenRealizada = By.xpath("//div[@id='content']/h1[contains(text(), 'Your order has been placed!')]");

    public By getLblOrdenRealizada() {
        return lblOrdenRealizada;
    }



}
