import javax.swing.*;
import java.util.Scanner;

public class EntradaSalida {

    /**
     * Opcion CONSOLA
     */

    public static final int SALIDA_CONSOLA = 1;
    public static final int SALIDA_WINDOW = 2;
    public static final int SALIDA_IMPRESORA = 3;

    /**
     * Salida por ventana o consola de mensaje
     *
     * @param msj    es la cadena que queremos iprimir
     * @param device es el dispositivo de salida, consola o ventana
     * @return
     */
    public static boolean salida(String msj, int device) {
        switch (device) {
            case SALIDA_CONSOLA:
            
                try {
                    System.out.println("Consola: " + msj);
                    return true;
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    return false;
                }

            case SALIDA_WINDOW:
                try {

                    JOptionPane.showMessageDialog(null, "Sale por una ventana" + msj);
                    return true;
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    return false;
                }

                /*case SALIDA_IMPRESORA:
                {
                  return true;} //imprimir
                 */
            default:
                return false;


        }


    }

    public static String entrada(String mensaje) {
        Scanner obx = new Scanner(System.in);
        System.out.println("Hey");
        return "";

    }


    public static String entradaString(String mensaje) {
        Scanner obx = new Scanner(System.in);
        System.out.println(mensaje);
        String data = obx.nextLine();//Leo input del user
        //respiesta.respuestString = data;
        return data;


    }

    public static int entradaEntero(String mensaje) {

        int edad;
        Scanner obx = new Scanner(System.in);

        try {
            System.out.println(mensaje);
            edad = obx.nextInt();
            return edad;
        } catch (Exception e) {
            edad = 0;
            System.out.println("Introduce tu edad");
            return edad;
        }


    }

    public static Integer entradaInteger(String mensaje) {
        Scanner obx = new Scanner(System.in);
        System.out.println(mensaje);
        try {
            Integer numero = obx.nextInt();
            return numero;

        } catch (Exception e) {
            return null;
        }


    }


}
