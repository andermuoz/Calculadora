package operaciones;
/**
 * Operaciones aqui ejecutaremos las operaciones entre el valor 1 y valor 2
 * 
 */
public class Operaciones{
	/**
	 * Se hace la suma entre el valor 1 y 2
	 * @param valor1 primer valor introduido por scanner
	 * @param valor2 segundo valor introduido por scanner
	 * @return numero valor de la suma.
	 */
    public int sumar (int valor1, int valor2){
        int numero;
        numero = valor1 + valor2;
        return numero;
    }
	/**
	 * Se hace la resta entre el valor 1 y 2
	 * 
	 * @param valor1 primer valor introduido por scanner
	 * @param valor2  segundo valor introduido por scanner
	 * @return numero  valor de la resta.
	 */
    public int restar (int valor1, int valor2){
        int numero;
        numero = valor1 - valor2;
        return numero;
    }
    
	/**
	 * Se hace la multiplicación entre el valor 1 y 2
	 * 
	 * @param valor1 primer valor recibido
	 * @param valor2 segundo valor recibido
	 * @return numero valor de la multiplicación.
	 */
    public int multiplicar (int valor1, int valor2){
        int numero;
        numero = valor1 * valor2;
        return numero;
    }
	/**
	 * Se hace la division entre el valor 1 y 2
	 * 
	 * @param valor1 primer valor recibido
	 * @param valor2 segundo valor recibido
	 * @return numero valor de la division.
	 */
    public int dividir (int valor1, int valor2){
        int numero;
        numero = valor1 / valor2;
        return numero;
    }
    
	/**
	 * Se calcula el resto entre el valor 1 y 2
	 * 
	 * @param valor1 primer valor recibido
	 * @param valor2 segundo valor recibido
	 * @return numero valor del resto.
	 */
    public int resto (int valor1, int valor2){
        int numero;
        numero = valor1 % valor2;
        return numero;
    }
}