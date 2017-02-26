package pe.egcc.pagoapp.service;

import pe.egcc.pagoapp.dto.PagoDto;

public class PagoService {
  
  public PagoDto procesar(PagoDto dto){
    // Variables
    double ingresos, renta, neto;
    // Proceso
    ingresos = dto.getHorasDia() 
            * dto.getDias() * dto.getPagoHora();
    renta = 0.0;
    if(ingresos > 1500.0){
      renta = ingresos * 0.08;
    } 
    neto = ingresos - renta;
    // Resultado
    dto.setIngresos(ingresos);
    dto.setRenta(renta);
    dto.setNeto(neto);
    return dto;
  }
  
}
