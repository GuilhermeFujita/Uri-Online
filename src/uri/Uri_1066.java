
package uri;

import java.util.Scanner;

/**
 *
 * @author Guilherme Sant Ana Fujita
 * @data 09/09/2017
 * @description Pares, Ímpares, Positivos e Negativos - 1066
 */
public class Uri_1066 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x, par, impar, pos, neg;
        par = impar = pos = neg = 0;
        
        for(int i=0; i<5; i++){
            x = scan.nextInt();
            if(x %2 == 0 && x >0){
                par++;
                pos++;
            }
            else if(x %2 !=0 && x>0){
                pos++;
                impar++;
            }
            else if(x %2 == 0 && x <0){
                par++;
                neg++;
            }
            else if(x % 2 !=0 && x <0){
                impar++;
                neg++;
            }
            if(x == 0){
                par++;
            }
        }
        System.out.printf("%d valor(es) par(es)\n", par);
        System.out.printf("%d valor(es) impar(es)\n", impar);
        System.out.printf("%d valor(es) positivo(s)\n", pos);
        System.out.printf("%d valor(es) negativo(s)\n", neg);
    }
}
