package us.opencart.abstracta.utils;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Excel {

    /*
      Este metodo lee los datos de una hoja de Excel específica y
      devuelve una lista de mapas, donde cada mapa representa una
      fila de datos con pares clave-valor. La clave corresponde
      al encabezado de la columna y el valor es el dato de la celda.
    */

    public static ArrayList<Map<String, String>> leerDatosDeHojaDeExcel(String nombreArchivo, String hojaDeExcel) throws IOException {
        ArrayList<Map<String, String>> arrayListDatoPlanTrabajo = new ArrayList<>();
        Map<String, String> informacionProyecto;

        // Cargar el archivo Excel desde el classpath
        try (InputStream inputStream = Excel.class.getClassLoader().getResourceAsStream("data/" + nombreArchivo);
             XSSFWorkbook newWorkbook = new XSSFWorkbook(inputStream)) { // Se cierra automáticamente

            XSSFSheet newSheet = newWorkbook.getSheet(hojaDeExcel);
            Iterator<Row> rowIterator = newSheet.iterator();
            Row titulos = rowIterator.next();

            while (rowIterator.hasNext()) {
                Row row = rowIterator.next();
                informacionProyecto = new HashMap<>();
                Iterator<Cell> cellIterator = row.cellIterator();

                while (cellIterator.hasNext()) {
                    Cell cell = cellIterator.next();
                    int columnIndex = cell.getColumnIndex();
                    String key = titulos.getCell(columnIndex).toString();

                    switch (cell.getCellTypeEnum()) {
                        case STRING:
                            informacionProyecto.put(key, cell.getStringCellValue());
                            break;
                        case NUMERIC:
                            informacionProyecto.put(key, String.valueOf((long) cell.getNumericCellValue()));
                            break;
                        case BLANK:
                            informacionProyecto.put(key, "");
                            break;
                        default:
                            break;
                    }
                }
                arrayListDatoPlanTrabajo.add(informacionProyecto);
            }
        }

        return arrayListDatoPlanTrabajo;
    }
}
