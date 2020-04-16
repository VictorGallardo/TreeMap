
package treemap;

import java.util.Map;
import java.util.TreeMap;

/**
 * Este pequeño programa es un prueba que muestra de manera breve el funcionamiento de TreeMap
 * 
 */
public class TreeMapTest {

  public static void main(String[] args) {
  
    Map<Integer, String> libros = new TreeMap<>();
    
    libros.put(2,"La Celestina");
    libros.put(4,"Cuentos del Decamerón");
    libros.put(1,"Antología de las mil y una noches");
    libros.put(5,"Divina Comedia I");
    libros.put(3,"La Colmena");
    libros.put(6,"La ciudad y los perros");
    
    
    libros.forEach((k,v) -> System.out.println(v));
      
    }
    
  }


