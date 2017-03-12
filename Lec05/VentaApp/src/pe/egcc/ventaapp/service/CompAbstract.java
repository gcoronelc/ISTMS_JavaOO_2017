package pe.egcc.ventaapp.service;

import pe.egcc.ventaapp.model.Item;

public abstract class CompAbstract {
  
  public final static double IGV = 0.18;
  public final double SERVICO = 0.10;
  
  public abstract Item[] procesar(double total);
  
}
