package us.opencart.abstracta.steps;


import net.serenitybdd.screenplay.ui.Select;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import us.opencart.abstracta.pages.InicioPage;
import us.opencart.abstracta.utils.ClicElementoLista;
import us.opencart.abstracta.utils.EsperaImplicita;
import net.thucydides.core.annotations.Step;
import us.opencart.abstracta.utils.Excel;

import java.io.IOException;
import java.security.Key;
import java.util.ArrayList;
import java.util.Map;


public class InicioSteps {

    InicioPage inicio= new InicioPage();

    private int indiceActual = 0; // Contador de índice para iterar de uno en uno

    @Step("abrir la url")
    public void abrirNavegador(){
        inicio.open();
    }

    @Step("limpiar campo buscar")
    public void limpiarCampoBuscar(){
        inicio.getDriver().findElement(inicio.getTxtBuscarInicio()).clear();

    }
    @Step("ubicarme campo buscar")
    public void seleccionarCampoBuscar(){
        inicio.getDriver().findElement(inicio.getTxtBuscarInicio()).click();

    }
    @Step("Ingresar producto buscar" )
    public void ingresarProducto() throws IOException {

        ArrayList<Map<String, String>> data = Excel.leerDatosDeHojaDeExcel("Data.xlsx", "Search");
        if (data.isEmpty()) {
            throw new RuntimeException("El archivo Excel está vacío.");
        }
        // Si llegamos al final de la lista, reiniciamos el índice a 0 para empezar de nuevo
        if (indiceActual >= data.size()) {
            indiceActual = 0;
        }
        String producto = data.get(indiceActual).get("producto");
        inicio.getDriver().findElement(inicio.getTxtBuscarInicio()).sendKeys(producto);
        EsperaImplicita.esperaImplicita(3);

        // Incrementar el índice para la próxima llamada
        indiceActual++;
    }

    @Step("presionar enter Campo buscar")
    public void enterCampoBuscar(){
        inicio.getDriver().findElement(inicio.getTxtBuscarInicio()).sendKeys(Keys.ENTER);

    }

    @Step("Agregar producto al carrito")
    public void agregarProductoCarrito(){


        // Desplazarse hasta el botón "Add to Cart"
      //  JavascriptExecutor js = (JavascriptExecutor) inicio.getDriver();
//js.executeScript("arguments[0].scrollIntoView(true);", inicio.getDriver().findElement(inicio.getBtnAddToCart()));

        // Hacer clic en el botón "Add to Cart
        inicio.getDriver().findElement(inicio.getBtnAddToCart()).click();

    }
    @Step("Click en  Items Cart")
    public void clickItemsCart(){
        inicio.getDriver().findElement(inicio.getBtnItemsCart()).click();
    }

    @Step("Click en View Cart")
    public void clickViewCart(){
        inicio.getDriver().findElement(inicio.getLnkViewCart()).click();
    }
    @Step("Validacion productos en carrito")
    public void validarProductosCarrito(){

       Assert.assertTrue(inicio.getDriver().findElement(inicio.getLnkSamsungGalaxyTab()).isDisplayed());
       Assert.assertTrue(inicio.getDriver().findElement(inicio.getLnkHTCTouchHD()).isDisplayed());

    }
    @Step("Click en Checkout")
    public void clickCheckout(){
        inicio.getDriver().findElement(inicio.getBtnCheckout()).click();

    }
    @Step("Click en Guest Checkout")
    public void clickGuestCheckout(){
        inicio.getDriver().findElement(inicio.getBtnGuestCheckout()).click();
    }
    @Step("Click Cotinue")
    public void clickCotinue(){
        inicio.getDriver().findElement(inicio.getBtnContinue()).click();
    }

    @Step("Registrar datos  personales formulario")
    public void registrarDatosPersonales()throws IOException {

        ArrayList<Map<String, String>> data = Excel.leerDatosDeHojaDeExcel("Data.xlsx", "Formulario");

        // Asumimos que quieres llenar el formulario con los datos de la primera fila (índice 0)
        Map<String, String> registro = data.get(0); // Cambia el índice si quieres usar otra fila

        // Llenar el formulario utilizando los campos correspondientes
        inicio.getDriver().findElement(inicio.getTxtFirsName()).sendKeys(registro.get("First Name")); // Llenar First Name
        inicio.getDriver().findElement(inicio.getLastName()).sendKeys(registro.get("Last Name")); // Llenar Last Name
        inicio.getDriver().findElement(inicio.getEMail()).sendKeys(registro.get("E-Mail")); // Llenar E-Mail
        inicio.getDriver().findElement(inicio.getTelephone()).sendKeys(registro.get("Telephone")); // Llenar Telephone
        inicio.getDriver().findElement(inicio.getCompany()).sendKeys(registro.get("Company")); // Llenar Company
        inicio.getDriver().findElement(inicio.getAddress1()).sendKeys(registro.get("Address 1")); // Llenar Address 1
        inicio.getDriver().findElement(inicio.getAddress2()).sendKeys(registro.get("Address 2")); // Llenar Address 2
        inicio.getDriver().findElement(inicio.getCity()).sendKeys(registro.get("City"));
        inicio.getDriver().findElement(inicio.getPostCode()).sendKeys(registro.get("Post Code")); // Llenar Post Code
        // Seleccionar el país (Colombia tiene el valor "47")
        inicio.selectCountryByValue("47"); // Selecciona "Colombia"
        // Seleccionar la región/estado (Quindio tiene el texto visible "Quindio")
        inicio.selectRegionByVisibleText("Quindio"); // Selecciona "Quindio" como región

    }

    @Step("Click en Continue2")
    public void clickContinue2(){

        inicio.getDriver().findElement(inicio.getBtnContinue2()).click();

    }

    @Step("Click en Continue3")
    public void clickContinue3(){

        inicio.getDriver().findElement(inicio.getBtnContinue3()).click();

    }

    @Step("Click en Continue4")
    public void clickContinue4(){

        inicio.getDriver().findElement(inicio.getBtnContinue4()).click();

    }
    @Step("Click en ConfirmaOrder")
    public void clickConfirmarOrdem(){

        inicio.getDriver().findElement(inicio.getBtnConfirmOrder()).click();

    }

    @Step("check en terminosCondiciones")
    public void CheckTerminosCondiciones(){

        inicio.getDriver().findElement(inicio.getChechTerminsCondiciones()).click();

    }

    @Step("Validacion compra reaizada")
    public void validarCompraSatisfactoria(){
        EsperaImplicita.esperaImplicita(3);

        Assert.assertTrue(inicio.getDriver().findElement(inicio.getLblOrderPlaced()).isDisplayed());

    }






    //ANTES
/*
    @Step("Hacer click en el primer producto")
    public void clicPrimerProducto(){

        inicio.getDriver().findElement(inicio.getBtnProducto1()).click();
        EsperaImplicita.esperaImplicita(2);

    }

    @Step("limpiar campo unidades")
    public void limpiarCampoUnidades(){
        inicio.getDriver().findElement(inicio.getTxtUnidad()).clear();

    }


    @Step("ubicarme campo unidades")
    public void seleccionarCampoUnidades(){

        inicio.getDriver().findElement(inicio.getTxtUnidad()).click();

    }


    @Step("Ingresar dos unidades")
    public void ingresarProductoUnoUnidad(){

        EsperaImplicita.esperaImplicita(2);
        inicio.getDriver().findElement(inicio.getTxtUnidad()).sendKeys("2");

    }

    @Step("Clic en añadir al carrito")
    public void agregarProductoCarrito(){

        inicio.getDriver().findElement(inicio.getBtnAgregarCarrito()).click();

    }

    @Step("Clic pagina de inicio")
    public void clicPaginaInicio(){

        inicio.getDriver().findElement(inicio.getBtnInicioPagina()).click();

    }

    @Step("Hacer click en el segundo producto")
    public void clicSegundoProducto(){

        inicio.getDriver().findElement(inicio.getBtnProducto2()).click();
        EsperaImplicita.esperaImplicita(2);

    }


    @Step("limpiar campo unidades producto 2")
    public void limpiarCampoUnidadesProducto2(){
        inicio.getDriver().findElement(inicio.getTxtProducto2()).clear();

    }


    @Step("ubicarme campo unidades producto 2")
    public void seleccionarCampoUnidadesProducto2(){

        inicio.getDriver().findElement(inicio.getTxtProducto2()).click();

    }


    @Step("Ingresar dos unidades producto 2")
    public void ingresarProductoUnoUnidadProducto2(){

        EsperaImplicita.esperaImplicita(2);
        inicio.getDriver().findElement(inicio.getTxtUnidad()).sendKeys("5");

    }

    @Step("Clic en añadir al carrito")
    public void agregarProductoCarrito2(){

        inicio.getDriver().findElement(inicio.getBtnAgregarCarrito2()).click();

    }
*/


}
