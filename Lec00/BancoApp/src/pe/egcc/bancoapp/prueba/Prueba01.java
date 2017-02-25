package pe.egcc.bancoapp.prueba;

import pe.egcc.bancoapp.service.BancoService;

public class Prueba01 {
  
  public static void main(String[] args) {
    // Datos
    double capital = 1000.0;
    double interes = 0.10;
    int n = 3;
    // Proceso
    BancoService bancoService = new BancoService();
    double importe = bancoService.calcularImporte(capital, interes, n);
    // Reporte
    System.out.println("Importe: " + importe);
  }
  
}
