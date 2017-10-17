
package uri;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Guilherme Sant Ana Fujita
 * @data 17/09/2017
 * @description Qual o Mais Rápido? - 2175
 */
public class Uri_2175 {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US); 
        Scanner scan = new Scanner(System.in);
        
        double o = scan.nextDouble(); //Otavio
        double b = scan.nextDouble(); //Bruno
        double i = scan.nextDouble(); //Ian
        
        if(o < b && o < i){
            System.out.println("Otavio");
        }
        else if(b < o && b < i){
            System.out.println("Bruno");
        }
        else if(i < o && i< b){
            System.out.println("Ian");
        }
        else{
            System.out.println("Empate");
        }
    }
}
