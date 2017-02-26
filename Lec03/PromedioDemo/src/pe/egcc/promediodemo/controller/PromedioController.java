package pe.egcc.promediodemo.controller;

import pe.egcc.app.lib.Mate;

public class PromedioController {
  
  private Mate bean;

  public PromedioController() {
    bean = new Mate();
  }

  public int promedio(int n1, int n2) {
    return bean.promedio(n1, n2);
  }
  
  
  
  
  
}
