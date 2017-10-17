
package uri;

import java.util.Scanner;

/**
 *
 * @author Guilherme Sant Ana Fujita
 * @data 22/09/2017
 * @description Construindo muralhas - 2650
 */
public class Uri_2650 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int entradas = scan.nextInt();
        int muralha = scan.nextInt();
        String maior= "";
        
        for(int i=0; i<entradas; i++){
            String nome = scan.next();
            String segundoNome = scan.next();
            int altura = scan.nextInt();
            
            if(altura > muralha){
                maior = nome + " " + segundoNome;
            }
        }
        System.out.println(maior);
    }
}
