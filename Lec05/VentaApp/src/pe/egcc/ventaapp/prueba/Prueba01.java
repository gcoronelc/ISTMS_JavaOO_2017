package pe.egcc.ventaapp.prueba;

import pe.egcc.ventaapp.model.Item;
import pe.egcc.ventaapp.service.BoletaService;
import pe.egcc.ventaapp.service.CompAbstract;

public class Prueba01 {
 
  public static void main(String[] args) {
    // Dato
    double total = 3456.78;
    // Proceso
    // CompAbstract comp = new FacturaService();
    CompAbstract comp = new BoletaService();
    Item[] repo = comp.procesar(total);
    // Reporte
    for(Item r: repo){
      System.out.println(r.getConcepto() + "  |  " + r.getValor());
    }
  }
  
}
