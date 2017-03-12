package pe.egcc.app.prueba;

import pe.egcc.app.model.Clase1;
import pe.egcc.app.model.Clase2;
import pe.egcc.app.model.Clase4;

public class Prueba02 {

  public static void main(String[] args) {
    
    Clase2 vc2 = new Clase2();
    
    if(vc2 instanceof Clase4){
      Clase4 vc4 = (Clase4) vc2;
      System.out.println("Si hay compatibilidad");
    } else {
      System.err.println("No hay compatibilidad");
    }
    
    if(vc2 instanceof Clase1){
      Clase1 vc1 = vc2;
      System.out.println("Si hay compatibilidad con Clase1");
    } else {
      System.err.println("No hay compatibilidad con Clase1");
    }
    
  }
  
}
