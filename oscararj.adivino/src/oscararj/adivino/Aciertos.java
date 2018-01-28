package oscararj.adivino;
import java.util.Scanner;
public class Aciertos {

	/** 
	 * clase Aciertos es parte del ejercicio del tema 7 de control de versiones
	 * @author oscar
	 * @version 22/01/2018
	 */
	

	    public static void main(String[] args) {
	        int n = 0,cont = 0;
	        int x = (int) (500 *Math.random());
	        /**metodo para crear un numero aleatorio y tratar de adivinarlo
	         * @param int n sera el valor inicial de int
	         * @param int x valor que le asignara el programa a int de forma aleatoria
	         */
	        
	        //System.out.print(x);
	        Scanner sc = new Scanner(System.in);
	        do {
	            System.out.print("\nIntroduce el valor de X: ");
	            n = sc.nextInt();
	            if (n > x) {
	                System.out.print("Te pasaste Amigo");
	            } else if (n < x){
	                System.out.print("Casi cerca ...");
	            }
	            /**
	             * pasaremos por teclado un nuevo valor de n
	             * el programa comprueba si el nuevo valor es mayor o menor que el que 
	             * ha asignado aleatoriamente y devolvera un mensaje segun el caso
	             */
	            cont++;
	        } while (n != x);
	        System.out.print("Exelente!!! Haz acertado , No. de intentos: "+cont );
	        sc.close();
	        /**
	         * cuando el valor introcducido sea igual al numero aleatorio escogido por el programa
	         * mostrara un mensaje y el numero de veces que hemos introducido n
	         * cont =numero de veces que introducimos n
	         */
	    }
	}









