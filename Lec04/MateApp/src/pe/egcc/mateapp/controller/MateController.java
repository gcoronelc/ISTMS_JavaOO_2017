package pe.egcc.mateapp.controller;

import pe.egcc.mateapp.service.MateService;

public class MateController {

  public long[] fibonacci(int n) {
    return MateService.fibonacci(n);
  }
  
}
