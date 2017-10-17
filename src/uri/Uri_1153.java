
package uri;

import java.util.Scanner;

/**
 *
 * @author Guilherme Sant Ana Fujita
 * @data 07/09/2017
 * @description Fatorial - 1153
 */
public class Uri_1153 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int fatorial=1;
        for(int i=1; i<=num; i++){
            fatorial = fatorial*i;
        }
        System.out.println(fatorial); 
    }
}
