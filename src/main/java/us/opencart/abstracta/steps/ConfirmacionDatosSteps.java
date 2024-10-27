package us.opencart.abstracta.steps;

import net.thucydides.core.annotations.Step;
import us.opencart.abstracta.pages.CarritoPage;
import us.opencart.abstracta.pages.ConfirmacionDatosPage;
import us.opencart.abstracta.utils.EsperaExplicita;
import us.opencart.abstracta.utils.Excel;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class ConfirmacionDatosSteps {


    ConfirmacionDatosPage confirmacionDatosPage = new ConfirmacionDatosPage();

    @Step("Click en Guest Checkout")
    public void hacerClicEnGuestCheckout(){
        EsperaExplicita.esperarPorElementoClicable(confirmacionDatosPage.getDriver(), confirmacionDatosPage.getBtnCheckoutComoInvitado(), 5);
        confirmacionDatosPage.getDriver().findElement(confirmacionDatosPage.getBtnCheckoutComoInvitado()).click();
    }
    @Step("Click Step 1   Checkout Options ")
    public void hacerClicEnContinuarOpcionPago(){
        EsperaExplicita.esperarPorElementoClicable(confirmacionDatosPage.getDriver(), confirmacionDatosPage.getBtnOpcionDePago(), 5);
        confirmacionDatosPage.getDriver().findElement(confirmacionDatosPage.getBtnOpcionDePago()).click();
    }

    @Step("Registrar datos  personales formulario")
    public void registrarDatosPersonalesDelFormulario()throws IOException {

        ArrayList<Map<String, String>> data = Excel.leerDatosDeHojaDeExcel("Data.xlsx", "Formulario");

        // Asumimos que quieres llenar el formulario con los datos de la primera fila (índice 0)
        Map<String, String> registro = data.get(0); // Cambia el índice si quieres usar otra fila

        // Llenar el formulario utilizando los campos correspondientes
        confirmacionDatosPage.getDriver().findElement(confirmacionDatosPage.getTxtNombre()).sendKeys(registro.get("First Name")); // Llenar First Name
        confirmacionDatosPage.getDriver().findElement(confirmacionDatosPage.getTxtApellido()).sendKeys(registro.get("Last Name")); // Llenar Last Name
        confirmacionDatosPage.getDriver().findElement(confirmacionDatosPage.getTxtCorreoElectronico()).sendKeys(registro.get("E-Mail")); // Llenar E-Mail
        confirmacionDatosPage.getDriver().findElement(confirmacionDatosPage.getTxtTelefono()).sendKeys(registro.get("Telephone")); // Llenar Telephone
        confirmacionDatosPage.getDriver().findElement(confirmacionDatosPage.getTxtEmpresa()).sendKeys(registro.get("Company")); // Llenar Company
        confirmacionDatosPage.getDriver().findElement(confirmacionDatosPage.getTxtDireccion1()).sendKeys(registro.get("Address 1")); // Llenar Address 1
        confirmacionDatosPage.getDriver().findElement(confirmacionDatosPage.getTxtDireccion2()).sendKeys(registro.get("Address 2")); // Llenar Address 2
        confirmacionDatosPage.getDriver().findElement(confirmacionDatosPage.getTxtCiudad()).sendKeys(registro.get("City"));
        confirmacionDatosPage.getDriver().findElement(confirmacionDatosPage.getTxtCodigoPostal()).sendKeys(registro.get("Post Code")); // Llenar Post Code
        // Seleccionar el país (Colombia tiene el valor "47")
        confirmacionDatosPage.selectCountryByValue("47"); // Selecciona "Colombia"
        // Seleccionar la región/estado (Quindio tiene el texto visible "Quindio")
        confirmacionDatosPage.selectRegionByVisibleText("Quindio"); // Selecciona "Quindio" como región

    }

    @Step("Click en Step 2 Billing Details")
    public void hacerClicEnDetallesDeFacturacion(){
        EsperaExplicita.esperarPorElementoClicable(confirmacionDatosPage.getDriver(), confirmacionDatosPage.getBtnContinuarDetallesFacturacion(), 5);
        confirmacionDatosPage.getDriver().findElement(confirmacionDatosPage.getBtnContinuarDetallesFacturacion()).click();

    }

    @Step("Click en Step 4 Delivery Method ")
    public void hacerClicMetodoDeEntrega(){
        EsperaExplicita.esperarPorElementoClicable(confirmacionDatosPage.getDriver(), confirmacionDatosPage.getBtnContinuarOpcionDeEntrega(), 5);
        confirmacionDatosPage.getDriver().findElement(confirmacionDatosPage.getBtnContinuarOpcionDeEntrega()).click();

    }

    @Step("Click en Step5 Payment Method")
    public void hacerClicMetodoDepago(){
        EsperaExplicita.esperarPorElementoClicable(confirmacionDatosPage.getDriver(), confirmacionDatosPage.getBtnContinuarMetodoDePago(), 5);
        confirmacionDatosPage.getDriver().findElement(confirmacionDatosPage.getBtnContinuarMetodoDePago()).click();

    }

    @Step("Hacer clic en términos y condiciones")
    public void hacerClicEnTerminosYCondiciones(){
        EsperaExplicita.esperarPorElementoClicable(confirmacionDatosPage.getDriver(), confirmacionDatosPage.getChkTerminosCondiciones(), 5);
        confirmacionDatosPage.getDriver().findElement(confirmacionDatosPage.getChkTerminosCondiciones()).click();
    }

    @Step("Hacer click en confirmar pedido")
    public void hacerClicConfirmarPedido(){
        EsperaExplicita.esperarPorElementoClicable(confirmacionDatosPage.getDriver(), confirmacionDatosPage.getBtnConfirmarPedido(), 5);
        confirmacionDatosPage.getDriver().findElement(confirmacionDatosPage.getBtnConfirmarPedido()).click();
    }


}
