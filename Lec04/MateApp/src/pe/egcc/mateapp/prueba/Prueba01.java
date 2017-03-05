package pe.egcc.mateapp.prueba;

import pe.egcc.mateapp.service.MateService;

public class Prueba01 {

  public static void main(String[] args) {
    // Dato
    int n = 6;
    // Proceso
    long[] lista = MateService.fibonacci(n);
    // Reporte
    if (lista != null) {
      for (long num : lista) {
        System.out.println(num);
      }
    }
  }

}
