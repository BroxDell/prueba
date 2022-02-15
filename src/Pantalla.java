
// Pantalla.java
// Representa a la pantalla del ATM

public class Pantalla
{
   // muestra un mensaje sin un retorno de carro
   public void mostrarMensaje( String mensaje ) 
   {
      System.out.print( mensaje ); 
   } // fin del m�todo mostrarMensaje

   // muestra un mensaje con un retorno de carro
   public void mostrarLineaMensaje( String mensaje ) 
   {
      System.out.println( mensaje );   
   } // fin del m�todo mostrarLineaMensaje

   // muestra un monto en d�lares
   public void mostrarMontoDolares( double monto )
   {
      System.out.printf( "$%,.2f", monto );   
   } // fin del m�todo mostrarMontoDolares 
} // fin de la clase Pantalla


