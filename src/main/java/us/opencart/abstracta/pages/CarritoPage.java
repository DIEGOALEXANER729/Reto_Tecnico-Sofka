package us.opencart.abstracta.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class CarritoPage extends PageObject {

    // Definición de los elementos de la interfaz de usuario

    By lnkSamsungGalaxyTab = By.xpath("//table[@class='table table-bordered']//td[@class='text-left']/a[text()='Samsung Galaxy Tab 10.1']");

    By lnkHTCTouchHD = By.xpath("//table[@class='table table-bordered']//td[@class='text-left']/a[text()='HTC Touch HD']");

    By btnProcederAlCheckout = By.xpath("//a[text()='Checkout']");

    // Métodos para obtener los distintos elementos

    public By getLnkSamsungGalaxyTab() {
        return lnkSamsungGalaxyTab;
    }

    public By getLnkHTCTouchHD() {
        return lnkHTCTouchHD;
    }

    public By getBtnProcederAlCheckout() {
        return btnProcederAlCheckout;
    }

}
