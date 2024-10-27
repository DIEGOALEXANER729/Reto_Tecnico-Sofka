package us.opencart.abstracta.pages;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://opencart.abstracta.us/")
public class InicioPage extends PageObject {



    //Campo de texto para busquedad de productos
    By txtCampoBusqueda = By.xpath("//input[contains(@placeholder, \"Search\")]");

    By lnkVerCarrito = By.xpath("//strong[contains(text(), 'View Cart')]");

    By btnItemsDelCarrito = By.xpath("//button[@data-toggle='dropdown' and @type='button']");


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
