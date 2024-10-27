package us.opencart.abstracta.stepDefinitions;

import us.opencart.abstracta.steps.*;
import io.cucumber.java.es.*;
import net.thucydides.core.annotations.Steps;
import us.opencart.abstracta.utils.EsperaExplicita; // Cambia a la nueva clase de espera
import us.opencart.abstracta.utils.EsperaImplicita;

import java.io.IOException;

public class FlujoCompraStepDefinitions {

    @Steps
    InicioSteps inicioSteps;

    @Steps
    ProductoSteps productoSteps;

    @Steps
    CarritoSteps carritoSteps;

    @Steps
    ConfirmacionDatosSteps confirmacionDatosSteps;

    @Steps
    OrdenSatisfactoriaSteps ordenSatisfactoriaSteps;

    @Dado("el usuario abra el navegador en la pagina principal de  Opencart abstracta")
    public void elUsuarioAbraElNavegadorEnLaPaginaPrincipalDeOpencartAbstracta() {
        inicioSteps.abrirNavegador();
    }

    @Cuando("el usuario agrega el primer producto al carrito")
    public void agregarPrimerProductoAlCarrito() throws IOException {
        inicioSteps.limpiarCampoDeBusqueda();
        inicioSteps.hacerClicEnCampoDeBusqueda();
        inicioSteps.ingresarProductoABuscar();
        inicioSteps.presionarEnterEnCampoBusqueda();
        productoSteps.agregarProductoAlCarrito();
    }

    @Cuando("el usuario agrega el segundo producto al carrito")
    public void agregarSegundoProductoAlCarrito() throws IOException {
        inicioSteps.limpiarCampoDeBusqueda();
        inicioSteps.hacerClicEnCampoDeBusqueda();
        inicioSteps.ingresarProductoABuscar();
        inicioSteps.presionarEnterEnCampoBusqueda();
        productoSteps.agregarProductoAlCarrito();
    }

    @Cuando("el usuario visualiza el carrito")
    public void visualizarCarrito() {
        inicioSteps.hacerClicEnItemsDelCarrito();
        inicioSteps.hacerClicEnVerCarrito();
    }

    @Entonces("el carrito debe contener los productos Producto {int} y Producto {int}")
    public void elCarritoDebeContenerLosProductosProductoYProducto(Integer int1, Integer int2) {
        carritoSteps.validarProductosEnCarrito();
    }

    @Entonces("el usuario selecciona Checkout")
    public void elUsuarioSeleccionaCheckout() {
        carritoSteps.hacerClicEnCheckout();
    }

    @Entonces("el usuario selecciona Guest Checkout")
    public void elUsuarioSeleccionaGuestCheckout() {
        confirmacionDatosSteps.hacerClicEnGuestCheckout();
        confirmacionDatosSteps.hacerClicEnContinuarOpcionPago();
    }

    @Entonces("el usuario completa los formularios")
    public void elUsuarioCompletaLosFormularios() throws IOException {
        EsperaImplicita.esperaImplicita(3);
        confirmacionDatosSteps.registrarDatosPersonalesDelFormulario();
        EsperaImplicita.esperaImplicita(3);
    }

    @Entonces("el usuario confirma la orden")
    public void elUsuarioConfirmaLaOrden() {
        confirmacionDatosSteps.hacerClicEnDetallesDeFacturacion();
        confirmacionDatosSteps.hacerClicMetodoDeEntrega();
        confirmacionDatosSteps.hacerClicEnTerminosYCondiciones();
        confirmacionDatosSteps.hacerClicMetodoDepago();
        confirmacionDatosSteps.hacerClicConfirmarPedido();
    }

    @Entonces("el mensaje Your order has been placed! debe aparecer en la página de confirmación")
    public void elMensajeYourOrderHasBeenPlacedDebeAparecerEnLaPáginaDeConfirmación() {
        ordenSatisfactoriaSteps.verificarCompraExitosa();
    }
}
