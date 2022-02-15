// SolicitudSaldo.java
// Representa una transacci�n de solicitud de saldo en el ATM

public class SolicitudSaldo extends Transaccion
{
   // constructor de SolicitudSaldo
   public SolicitudSaldo( int numeroCuentaUsuario, Pantalla pantallaATM, 
      BaseDatosBanco baseDatosBanco )
   {
      super( numeroCuentaUsuario, pantallaATM, baseDatosBanco );
   } // fin del constructor de SolicitudSaldo

   // realiza la transacci�n
   @Override
   public void ejecutar()
   {
      // obtiene referencias a la base de datos del banco y la pantalla
      BaseDatosBanco baseDatosBanco = obtenerBaseDatosBanco();
      Pantalla pantalla = obtenerPantalla();

      // obtiene el saldo disponible para la cuenta implicada
      double saldoDisponible = 
         baseDatosBanco.obtenerSaldoDisponible( obtenerNumeroCuenta() );

      // obtiene el saldo total para la cuenta implicada
      double saldoTotal = 
         baseDatosBanco.obtenerSaldoTotal( obtenerNumeroCuenta() );
      
      // muestra la informaci�n del saldo en la pantalla
      pantalla.mostrarLineaMensaje( "\nAqui tiene su estado de saldo:" );
      pantalla.mostrarMensaje( " - Saldo disponible: " ); 
      pantalla.mostrarMontoDolares( saldoDisponible );
      pantalla.mostrarMensaje( "\n - Saldo total:     " );
      pantalla.mostrarMontoDolares( saldoTotal );
      pantalla.mostrarLineaMensaje( "" );
   } // fin del m�todo ejecutar
} // fin de la clase SolicitudSaldo



