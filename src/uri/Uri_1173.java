
package uri;

import java.util.Scanner;

/**
 *
 * @author Guilherme Sant Ana Fujita
 * @data 08/09/2017
 * @description Preenchimento de um vetor I - 1173
 */
public class Uri_1173 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n[] = new int[10];
        int v = scan.nextInt();
        n[0] = v;
        int anterior = n[0];
        System.out.printf("N[%d] = %d\n", 0, n[0]);
        for(int i=1; i<n.length; i++){
            n[i] = 2*anterior;
            anterior = n[i];
            
            System.out.printf("N[%d] = %d\n", i, n[i]);
        }
    }
}
