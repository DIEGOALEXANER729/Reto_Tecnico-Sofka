package us.opencart.abstracta.utils;

public class EsperaImplicita {

    public static void esperaImplicita(int segundos) {

        /*
      Esta clase proporciona un metodo para implementar esperas implícitas
      en las pruebas automatizadas. Se utiliza principalmente para pausar
      la ejecución de la prueba durante un período especificado,
      permitiendo que la interfaz de usuario tenga tiempo suficiente para
      actualizarse o cargar los elementos necesarios.
        */
        try {
            Thread.sleep(segundos * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace(System.out);
        }
    }
}
