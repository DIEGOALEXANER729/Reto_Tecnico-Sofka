package us.opencart.abstracta.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class EsperaExplicita {

    /*
      Esta clase proporciona métodos de espera explícita para facilitar
      la sincronización en las pruebas automatizadas. Ayuda a evitar
      condiciones de carrera al asegurarse de que los elementos sean
      interactivos antes de realizar acciones sobre ellos.
    */
    // Metodo para esperar a que un elemento sea clickeable
    public static void esperarPorElementoClicable(WebDriver driver, By by, int tiempoEspera) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(tiempoEspera));
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    // Sobrecarga del método para esperar por un WebElement directamente
    public static void esperarPorElementoClicable(WebDriver driver, WebElement elemento, int tiempoEspera) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(tiempoEspera));
        wait.until(ExpectedConditions.elementToBeClickable(elemento));
    }


}
