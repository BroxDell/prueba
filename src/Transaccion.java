// Transaccion.java
// La superclase abstracta Transaccion representa una transacci�n con el ATM

public abstract class Transaccion
{
   private int numeroCuenta; // indica la cuenta implicada
   private Pantalla pantalla; // pantalla del ATM
   private BaseDatosBanco baseDatosBanco; // base de datos de informaci�n de cuentas

   // el constructor de Transaccion es invocado por las subclases mediante super()
   public Transaccion( int numeroCuentaUsuario, Pantalla pantallaATM, 
      BaseDatosBanco baseDatosBancoATM )
   {
      numeroCuenta = numeroCuentaUsuario;
      pantalla = pantallaATM;
      baseDatosBanco = baseDatosBancoATM;
   } // fin del constructor de Transaccion

   // devuelve el n�mero de cuenta 
   public int obtenerNumeroCuenta()
   {
      return numeroCuenta; 
   } // fin del m�todo obtenerNumeroCuenta

   // devuelve una referencia a la pantalla
   public Pantalla obtenerPantalla()
   {
      return pantalla;
   } // fin del m�todo obtenerPantalla

   // devuelve una referencia a la base de datos del banco
   public BaseDatosBanco obtenerBaseDatosBanco()
   {
      return baseDatosBanco;
   } // fin del m�todo obtenerBaseDatosBanco

   // realiza la transacci�n (cada subclase sobrescribe este m�todo)
   abstract public void ejecutar();
} // fin de la clase Transaccion




