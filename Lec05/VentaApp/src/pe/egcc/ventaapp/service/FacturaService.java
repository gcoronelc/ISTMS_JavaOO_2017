package pe.egcc.ventaapp.service;

import pe.egcc.ventaapp.model.Item;

public class FacturaService extends CompAbstract{

  @Override
  public Item[] procesar(double total) {
    // Variables
    double consumo, impuesto, servicio, totalGeneral;
    // Proceso
    consumo = total / (1 + IGV);
    impuesto = total - consumo;
    servicio = total * SERVICO;
    totalGeneral = total + servicio;
    // Reporte
    Item[] repo = {
      new Item("Consumo", consumo),
      new Item("Impuesto", impuesto),
      new Item("Total", total),
      new Item("Servicio", servicio),
      new Item("Total General", totalGeneral)
    };
    return repo;
  }

  
}
