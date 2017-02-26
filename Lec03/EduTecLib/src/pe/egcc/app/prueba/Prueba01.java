package pe.egcc.app.prueba;

import pe.egcc.app.lib.Mate;

public class Prueba01 {

  public static void main(String[] args) {
    Mate bean = new Mate();
    System.out.println("Demo 1: " + bean.promedio(12, 16));
    System.out.println("Demo 2: " + bean.promedio(12, 16, 15));
    System.out.println("Demo 3: " + bean.promedio(12, 16, 17, 16));
    System.out.println("Demo 4: " + bean.promedio(12, 16, 16, 11, 14));
  }
  
}
