package pe.egcc.app.model;

public class Clase1 {

  /**
   * Constructor por defecto.
   */
  public Clase1() {
    System.out.println("Hola Gustavo.");
  }
  
  /**
   * Constructor adicional.
   * @param nombre 
   */
  public Clase1(String nombre) {
    System.out.println("Hola " + nombre + ".");
  }

  public int sumar(int n1, int n2) {
    return (n1 + n2);
  }

}
