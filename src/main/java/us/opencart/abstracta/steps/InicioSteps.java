package us.opencart.abstracta.steps;


import org.junit.Assert;
import org.openqa.selenium.Keys;
import us.opencart.abstracta.pages.InicioPage;
import us.opencart.abstracta.pages.ProductoPage;
import us.opencart.abstracta.utils.EsperaImplicita;
import net.thucydides.core.annotations.Step;
import us.opencart.abstracta.utils.Excel;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;


public class InicioSteps {

    InicioPage inicio= new InicioPage();

    @Step("Click en  Items Cart")
    public void hacerClicEnItemsDelCarrito(){
        inicio.getDriver().findElement(inicio.getBtnItemsDelCarrito()).click();
    }

    private int indiceActual = 0; // Contador de índice para iterar de uno en uno

    @Step("abrir la url")
    public void abrirNavegador(){
        inicio.open();
    }

    @Step("Limpiar campo de búsqueda")
    public void limpiarCampoDeBusqueda(){
        inicio.getDriver().findElement(inicio.getTxtCampoBusqueda()).clear();

    }
    @Step("Hacer clic en el campo de búsqueda")
    public void hacerClicEnCampoDeBusqueda(){
        inicio.getDriver().findElement(inicio.getTxtCampoBusqueda()).click();

    }
    @Step("Ingresar producto a buscar" )
    public void ingresarProductoABuscar () throws IOException {

        ArrayList<Map<String, String>> data = Excel.leerDatosDeHojaDeExcel("Data.xlsx", "Search");
        if (data.isEmpty()) {
            throw new RuntimeException("El archivo Excel está vacío.");
        }
        // Si llegamos al final de la lista, reiniciamos el índice a 0 para empezar de nuevo
        if (indiceActual >= data.size()) {
            indiceActual = 0;
        }
        String producto = data.get(indiceActual).get("producto");
        inicio.getDriver().findElement(inicio.getTxtCampoBusqueda()).sendKeys(producto);
        EsperaImplicita.esperaImplicita(3);

        // Incrementar el índice para la próxima llamada
        indiceActual++;
    }


    @Step("presionar enter Campo buscar")
    public void presionarEnterEnCampoBusqueda(){
        inicio.getDriver().findElement(inicio.getTxtCampoBusqueda()).sendKeys(Keys.ENTER);

    }



    @Step("Click en View Cart")
    public void hacerClicEnVerCarrito(){
        inicio.getDriver().findElement(inicio.getLnkVerCarrito()).click();
    }




}
