
package uri;

import java.util.Scanner;

/**
 *
 * @author Guilherme Sant Ana Fujita
 * @data 03/09/2017 
 */
public class Uri_1044 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        if((a % b == 0) || (b % a == 0)){
            System.out.println("Sao Multiplos");
        }
        else{
            System.out.println("Nao sao Multiplos");
        }
    }
}
