
package uri;

import java.util.Scanner;

/**
 *
 * @author Guilherme Sant Ana Fujita
 * @data 03/09/2017 
 */
public class Uri_1065 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numeros[] = new int[5];
        int cont = 0;
        for(int i=0; i<numeros.length; i++){
            numeros[i] = scan.nextInt();
            if(numeros[i] % 2 ==0){
                cont++;
            }
        }
        System.out.println(cont+ " valores pares");
    }
}
