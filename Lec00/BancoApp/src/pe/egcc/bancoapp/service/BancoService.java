package pe.egcc.bancoapp.service;

public class BancoService {
  
  public double calcularImporte(
          double capital, double interes, int n){
    
    double importe; 
    importe = capital * Math.pow(1 + interes, n); 
    return importe;
    
  }
  
  
}
