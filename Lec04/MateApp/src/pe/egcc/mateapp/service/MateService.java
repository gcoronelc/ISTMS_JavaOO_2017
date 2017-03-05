package pe.egcc.mateapp.service;

public final class MateService {

  /**
   * Constructor privado, no se pueden crear instancias.
   */
  private MateService() {
  }

  public static long factorial(int n) {
    return 0;
  }

  public static int mcd(int n1, int n2) {
    return 0;
  }

  public static int mcm(int n1, int n2) {
    return 0;
  }

  public static long[] fibonacci(int n) {
    if(n < 1){
      return null;
    }
    long lista[] = new long[n];
    lista[0] = 0;
    if (n > 1) {
      lista[1] = 1;
    }
    for (int i = 2; i < n; i++) {
      lista[i] = lista[i - 1] + lista[i - 2];
    }
    return lista;
  }

  public static boolean esPrimo(int n) {
    return false;
  }

}
