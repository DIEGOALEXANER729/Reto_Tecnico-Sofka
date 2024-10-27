package us.opencart.abstracta.stepDefinitions;


import us.opencart.abstracta.steps.InicioSteps;
import io.cucumber.java.es.*;
import net.thucydides.core.annotations.Steps;
import us.opencart.abstracta.utils.EsperaImplicita;

import java.io.IOException;


public class AgregarProductosStepDefinitions {


    @Steps
    InicioSteps inicioSteps;

    @Dado("el usuario abra el navegador en la pagina principal de  Opencart abstracta")
    public void elUsuarioAbraElNavegadorEnLaPaginaPrincipalDeOpencartAbstracta() {

        inicioSteps.abrirNavegador();

    }
    @Cuando("el usuario agrega el primer producto al carrito")
    public void agregarPrimerProductoAlCarrito() throws IOException {

        inicioSteps.limpiarCampoBuscar();
        inicioSteps.seleccionarCampoBuscar();
        inicioSteps.ingresarProducto();
        inicioSteps.enterCampoBuscar();
        inicioSteps.agregarProductoCarrito();
    }

    @Cuando("el usuario agrega el segundo producto al carrito")
    public void agregarSegundoProductoAlCarrito() throws IOException {

        inicioSteps.limpiarCampoBuscar();
        inicioSteps.seleccionarCampoBuscar();
        inicioSteps.ingresarProducto();
        inicioSteps.enterCampoBuscar();
        EsperaImplicita.esperaImplicita(2);
        inicioSteps.agregarProductoCarrito();
        EsperaImplicita.esperaImplicita(3);

    }

    @Cuando("el usuario visualiza el carrito")
    public void visualizarCarrito() {
        inicioSteps.clickItemsCart();
        inicioSteps.clickViewCart();
        EsperaImplicita.esperaImplicita(3);

    }

    @Entonces("el carrito debe contener los productos Producto {int} y Producto {int}")
    public void elCarritoDebeContenerLosProductosProductoYProducto(Integer int1, Integer int2) {
        inicioSteps.validarProductosCarrito();
        EsperaImplicita.esperaImplicita(5);
    }
    @Entonces("el usuario selecciona Checkout")
    public void elUsuarioSeleccionaCheckout() {
        inicioSteps.clickCheckout();
        EsperaImplicita.esperaImplicita(5);
    }
    @Entonces("el usuario selecciona Guest Checkout")
    public void elUsuarioSeleccionaGuestCheckout() {
        inicioSteps.clickGuestCheckout();
        EsperaImplicita.esperaImplicita(2);
        inicioSteps.clickCotinue();
        EsperaImplicita.esperaImplicita(2);
    }

    @Entonces("el usuario completa los formularios")
    public void elUsuarioCompletaLosFormularios() throws IOException {
       inicioSteps.registrarDatosPersonales();
        EsperaImplicita.esperaImplicita(4);

    }

    @Entonces("el usuario confirma la orden")
    public void elUsuarioConfirmaLaOrden() {

        inicioSteps.clickContinue2();
        EsperaImplicita.esperaImplicita(2);
        inicioSteps.clickContinue3();
        EsperaImplicita.esperaImplicita(2);
        inicioSteps.CheckTerminosCondiciones();
        inicioSteps.clickContinue4();
        EsperaImplicita.esperaImplicita(2);
        inicioSteps.clickConfirmarOrdem();
        EsperaImplicita.esperaImplicita(2);


    }


    @Entonces("el mensaje Your order has been placed! debe aparecer en la página de confirmación")
    public void elMensajeYourOrderHasBeenPlacedDebeAparecerEnLaPáginaDeConfirmación() {

        inicioSteps.validarCompraSatisfactoria();

    }


}