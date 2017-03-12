package pe.egcc.ventaapp.prueba;

import pe.egcc.ventaapp.model.Item;
import pe.egcc.ventaapp.service.CompFactory;

public class Prueba02 {
 
  public static void main(String[] args) {
    // Dato
    double total = 3456.78;
    // Proceso
    Item[] repo = CompFactory.
            getComp(CompFactory.BOLETA).procesar(total);
    // Reporte
    for(Item r: repo){
      System.out.println(r.getConcepto() + "  |  " + r.getValor());
    }
  }
  
}
