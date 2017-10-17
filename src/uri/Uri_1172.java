
package uri;

import java.util.Scanner;

/**
 *
 * @author Guilherme Sant Ana Fujita
 * @data 08/09/2017
 * @description Substituição em Vetor I - 1172
 */
public class Uri_1172 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x[] = new int[10];
        
        for(int i=0; i<x.length; i++){
            x[i] = scan.nextInt();
            if(x[i] <=0){
                x[i] = 1;
            }
        }
        
        for(int i=0; i<x.length; i++){
            System.out.printf("X[%d] = %d\n", i, x[i]);
        }
    }
}
