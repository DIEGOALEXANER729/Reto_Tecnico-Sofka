package us.opencart.abstracta.pages;

import org.openqa.selenium.By;
import net.serenitybdd.core.pages.PageObject;

public class ProductoPage extends PageObject {

    By btnAgregarAlCarrito = By.xpath("//button[span[text()='Add to Cart']]");


    public By getBtnAgregarAlCarrito() {
        return btnAgregarAlCarrito;
    }



}
