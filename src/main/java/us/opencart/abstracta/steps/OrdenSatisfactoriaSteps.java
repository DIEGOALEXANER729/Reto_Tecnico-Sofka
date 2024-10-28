package us.opencart.abstracta.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import us.opencart.abstracta.pages.OrdenSatisfactoriaPage;
import us.opencart.abstracta.utils.EsperaImplicita;

public class OrdenSatisfactoriaSteps {

    /*
       Esta clase contiene los pasos relacionados con la verificación de la
       pantalla de orden satisfactoria, asegurando que el usuario haya
       completado la compra exitosamente.
    */
    OrdenSatisfactoriaPage ordenSatisfactoriaPage =new OrdenSatisfactoriaPage();

    @Step("Validacion compra reaizada Exitosamente")
    public void verificarCompraExitosa(){
        EsperaImplicita.esperaImplicita(3);

        Assert.assertTrue(ordenSatisfactoriaPage.getDriver().findElement(ordenSatisfactoriaPage.getLblOrdenRealizada()).isDisplayed());

    }
}
