package us.opencart.abstracta.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features",
        tags = "",
        glue = "us.opencart.abstracta.stepDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class AgregarProductos {

}
