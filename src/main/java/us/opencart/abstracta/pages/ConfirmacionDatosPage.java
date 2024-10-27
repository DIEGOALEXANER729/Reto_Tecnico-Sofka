package us.opencart.abstracta.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import net.serenitybdd.core.pages.PageObject;

public class ConfirmacionDatosPage extends PageObject  {


    By btnCheckoutComoInvitado = By.xpath("//input[@type='radio' and @name='account' and @value='guest']");

    By btnOpcionDePago = By.xpath("//input[@type='button' and @value='Continue']");

    By txtNombre = By.xpath("//*[@placeholder=\"First Name\"]");

    By txtApellido = By.xpath(" //*[@placeholder=\"Last Name\"]");

    By txtCorreoElectronico = By.xpath("//*[@id='input-payment-email']");

    By txtTelefono = By.xpath("//*[@id='input-payment-telephone']");

    By txtEmpresa = By.xpath("//input[@placeholder=\"Company\"]");

    By txtDireccion1 = By.xpath("//*[@id='input-payment-address-1']");

    By txtDireccion2 = By.xpath("//*[@id='input-payment-address-2']");

    By txtCiudad = By.xpath("//*[@id='input-payment-city']");

    By txtCodigoPostal = By.xpath("//*[@id='input-payment-postcode']");

    By txtRegionEstado = By.xpath("//*[@id='input-payment-zone']");

    @FindBy(id = "input-payment-country")
    private WebElementFacade countryDropdown; // Dropdown para seleccionar el país

    @FindBy(id = "input-payment-zone")
    private WebElementFacade regionDropdown; // Dropdown para seleccionar la región/estado

    By btnContinuarDetallesFacturacion = By.xpath("//*[@id='button-guest']");

    By btnContinuarOpcionDeEntrega = By.xpath("//*[@id='button-shipping-method']");

    By chkTerminosCondiciones = By.xpath("//*[contains(@name, \"agree\")]");

    By btnContinuarMetodoDePago = By.xpath("//*[@id='button-payment-method']");


    By btnConfirmarPedido = By.xpath("//*[@id='button-confirm']");



    public By getBtnCheckoutComoInvitado() {
        return btnCheckoutComoInvitado;
    }

    public By getBtnOpcionDePago() {
        return btnOpcionDePago;
    }

    public By getTxtNombre() {
        return txtNombre;
    }

    public By getTxtApellido() {
        return txtApellido;
    }

    public By getTxtCorreoElectronico() {
        return txtCorreoElectronico;
    }

    public By getTxtTelefono() {
        return txtTelefono;
    }

    public By getTxtEmpresa() {
        return txtEmpresa;
    }

    public By getTxtDireccion1() {
        return txtDireccion1;
    }

    public By getTxtDireccion2() {
        return txtDireccion2;
    }

    public By getTxtCiudad() {
        return txtCiudad;
    }

    public By getTxtCodigoPostal() {
        return txtCodigoPostal;
    }



    public By getTxtRegionEstado() {
        return txtRegionEstado;
    }

    public By getBtnContinuarDetallesFacturacion() {
        return btnContinuarDetallesFacturacion;
    }

    public By getBtnContinuarOpcionDeEntrega() {
        return btnContinuarOpcionDeEntrega;
    }

    public By getChkTerminosCondiciones() {
        return chkTerminosCondiciones;
    }

    public By getBtnContinuarMetodoDePago() {
        return btnContinuarMetodoDePago;
    }

    public By getBtnConfirmarPedido() {
        return btnConfirmarPedido;
    }

    public void selectCountryByValue(String value) {
        countryDropdown.selectByValue(value); // Selecciona usando el valor
    }

    public void selectRegionByVisibleText(String regionName) {
        regionDropdown.selectByVisibleText(regionName); // Selecciona la región usando el texto visible
    }


}
