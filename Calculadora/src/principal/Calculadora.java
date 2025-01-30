package principal;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.*;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import operaciones.Operaciones;
import menu.Menu;

/**Aplicacion principal a ejecutar.
 *@author Ander Muñoz
 *@version 1
 */
public class Calculadora{
	//PRIMER LOGGER
	 private static final Logger logger = Logger.getLogger(Calculadora.class.getName());
	    private static final LogManager logManager = LogManager.getLogManager();
	    static {
	        try {
	        	LogManager logManager = LogManager.getLogManager();
	            logManager.readConfiguration(new FileInputStream("./Calculadora/src/properties/log.properties"));
	        } catch (IOException e) {
	        	  
	            System.err.println("No se pudo encontrar el logger:  " + e.getMessage());
	        }
	    }
	
/** Main principal
 * 
 *@param args Argumentos de la linea de comandos.
 */
    public static void main(String[] args) {   
        int resultado = 0;
        String operacion = "";
        int[] operandos = new int [2];
        
        Menu menu = new Menu();
        Operaciones operaciones = new Operaciones();
        
        do{
            operandos = menu.pedirNumeros();
            operacion = menu.menuOpciones();
            
     try {
            
            if (operacion.equalsIgnoreCase("+")){
                resultado = operaciones.sumar(operandos[0], operandos[1]);
                System.out.println ("Resultado: " + resultado);
                logger.log(Level.FINE, "operacion suma: ");
            } else if (operacion.equalsIgnoreCase("-")){
                resultado = operaciones.restar(operandos[0], operandos[1]);
                System.out.println ("Resultado: " + resultado);
                logger.log(Level.FINE, "operacion resta:");
            } else if (operacion.equalsIgnoreCase("*")){
                resultado = operaciones.multiplicar(operandos[0], operandos[1]);
                System.out.println ("Resultado: " + resultado);
                logger.log(Level.FINE, "operacion multiplicacion: ");
            } else if (operacion.equalsIgnoreCase("/")){
                resultado = operaciones.dividir(operandos[0], operandos[1]);
                System.out.println ("Resultado: " + resultado);
                logger.log(Level.FINE, "operacion division: ");
            } else if (operacion.equalsIgnoreCase("%")){
                resultado = operaciones.resto(operandos[0], operandos[1]);
                logger.log(Level.FINE, "operacion resto:");
                System.out.println ("Resultado: " + resultado);
            } else {
                System.out.println ("Operaci�n no v�lida");
            }
            
     }catch(ArithmeticException e) {
    	 System.err.println("ERROR = " + e.getMessage());
     }
        }   while (menu.repetir());
        
        
    }
  
}

