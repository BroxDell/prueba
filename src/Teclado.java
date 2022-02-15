// Teclado.java
// Representa el teclado del ATM
import java.util.Scanner; // el programa usa a Scanner para obtener la entrada del usuario

public class Teclado
{
   private Scanner entrada; // lee datos de la l�nea de comandos
                         
   // el constructor sin argumentos inicializa el objeto Scanner
   public Teclado()
   {
      entrada = new Scanner( System.in );    
   } // fin del constructor sin argumentos de Teclado

   // devuelve un valor entero introducido por el usuario
   public int obtenerEntrada()
   {
      return entrada.nextInt(); // suponemos que el usuario introduce un entero  
   } // fin del m�todo obtenerEntrada
} // fin de la clase Teclado  



