package us.opencart.abstracta.utils;

import org.openqa.selenium.WebElement;
import java.util.List;


public class ClicElementoLista {

    public static void clicElemento(List<WebElement> lstElementos, String text0){


        for(int i=0; i< lstElementos.size();i++){
            String attribute = lstElementos.get(i).getAttribute("title");
            if(attribute.contains(text0)){
                try{
                    lstElementos.get(i).click();
                    break;

                }catch (Exception e){
                    System.out.println("error en "+e.getMessage());
                }


            }
        }

    }
}
