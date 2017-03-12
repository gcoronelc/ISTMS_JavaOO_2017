package pe.egcc.ventaapp.service;

public final class CompFactory {

  private CompFactory() {
  }
    
  // Tipos de comprobante
  public static final String FACTURA = "Factura";
  public static final String BOLETA = "Boleta";
  
  // Obtener tipos
  public static final String[] getTipos(){
    String[] tipos = {FACTURA, BOLETA};
    return tipos;
  }
  
  // Obtener comprobantes
  public static final CompAbstract getComp(String tipo){
    CompAbstract comp = null;
    switch(tipo){
      case FACTURA:
        comp = new FacturaService();
        break;
      case BOLETA:
        comp = new BoletaService();
        break;
    }
    return comp;
  }
  
}
