package EjemplosArrayList;

import java.util.ArrayList;
import java.util.Collections;

/**
 * ArrayList12 -> Ordenar con el método sort objetos
 * 
 * @author David Márquez Córdoba
 */
public class ArrayList12 {

  public static void main(String[] args) {
    
    ArrayList<Gato> g = new ArrayList<Gato>();

    //Creamos objetos de tipo gato
    g.add(new Gato("Garfield", "naranja", "mestizo"));
    g.add(new Gato("Pepe", "gris", "angora"));
    g.add(new Gato("Mauri", "blanco", "manx"));
    g.add(new Gato("Ulises", "marrón", "persa"));
    g.add(new Gato("Adán", "negro", "angora"));

    //Lista desordenada por nombre
    for (Gato gatos : g) {
      System.out.println(gatos);
    }

    System.out.println("");
    //Ordenamos
    Collections.sort(g);

    System.out.println("");
    //Lista ordenada por nombre
    for (Gato gatos : g) {
      System.out.println(gatos);
    }
  }
}
