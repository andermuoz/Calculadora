package menu;
import java.util.Scanner;
/**Menu de opciones de la Calculadora donde escogeremos la operacion a realizar
 * 
 */
public class Menu {
    private static Scanner teclado = new Scanner(System.in);
	/**
	 * Se piden los valores mediante ret 1 y ret 2 scanner
	 * @return array con los 2 valores operando.
	 */
    public int[] pedirNumeros(){
        int[] ret = new int[2];
        System.out.print ("Operando 1: ");
        ret [0] = teclado.nextInt();
        System.out.print ("Operando 2: ");
        ret [1] = teclado.nextInt();
        return ret;
    }
    /**
     * Pedimos que operacion se quiere realizar, suma,resta,multiplicacion,division o resto
     * @return ret operacion a realizar y validando que existe
     */
    public String menuOpciones() {
        String ret = "";
        do {
            System.out.print ("Operaciones [+, -, *, /, %]: ");
            ret = teclado.next();
        } while (!((ret.equalsIgnoreCase("+")) || (ret.equalsIgnoreCase("-")) ||
                (ret.equalsIgnoreCase("*")) || (ret.equalsIgnoreCase("/")) ||
                (ret.equalsIgnoreCase("%"))
                ));
                return ret;
    }
    /**
     * Metodo para seguir utilizando el programa mediando while
     * @return devuelve el valor s = true o el valor n= false.
     */
    public boolean repetir(){
        boolean ret = false;
        String respuesta;
        do {
            System.out.print ("�Desea continuar trabajando con la calculadora? [s / n]");
            respuesta = teclado.next();
        } while (!((respuesta.equalsIgnoreCase("s")) || (respuesta.equalsIgnoreCase("n"))
                    ));
                    
        if (respuesta.equalsIgnoreCase("s")){
            ret = true;
        }
        return ret;
    }
}