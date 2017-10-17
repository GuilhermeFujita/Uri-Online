
package uri;

import java.util.Scanner;

/**
 *
 * @author Guilherme Sant Ana Fujita
 * @data 29/09/2017 
 * @description Quadrado e ao Cubo - 1143
 */
public class Uri_1143 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        int i = 1, quad=0, cubo=0;
        while(true){
            if(i >n){
                break;
            }
            else{
                quad = (int) Math.pow(i, 2);
                cubo = (int) Math.pow(i, 3);
                System.out.printf("%d %d %d\n", i, quad, cubo);
                i++;
            }
        }
    }
}
