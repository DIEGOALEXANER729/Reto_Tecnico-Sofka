package us.opencart.abstracta.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class OrdenSatisfactoriaPage extends PageObject {

    By lblOrdenRealizada = By.xpath("//div[@id='content']/h1[contains(text(), 'Your order has been placed!')]");

    public By getLblOrdenRealizada() {
        return lblOrdenRealizada;
    }



}
