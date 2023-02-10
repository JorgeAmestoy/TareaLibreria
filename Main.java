public class Main {
    public static void main(String[] args) {

       String nombre = EntradaSalida.entradaString("Cómo te llamas");
       EntradaSalida.salida(nombre, EntradaSalida.SALIDA_CONSOLA);

       String direccion = EntradaSalida.entradaString("Cual es tu direccion");
       EntradaSalida.salida(direccion, EntradaSalida.SALIDA_CONSOLA);

       int edad = EntradaSalida.entradaEntero("Cuál es tu edad");
       EntradaSalida.salida(String.valueOf(edad),EntradaSalida.SALIDA_CONSOLA);

       Integer numero = EntradaSalida.entradaInteger("Dime un numero");
       if(numero!= null){
           EntradaSalida.salida(numero.toString(), EntradaSalida.SALIDA_CONSOLA);

       }else{
           EntradaSalida.salida("Error en entero", EntradaSalida.SALIDA_CONSOLA);
       }






    }
}