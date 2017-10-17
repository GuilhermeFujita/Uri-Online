
package uri;

import java.util.Scanner;

/**
 *
 * @author Guilherme Sant Ana Fujita
 * @data 15/09/2017 
 * @description Crescente e Decrescente - 1113
 */
public class Uri_1113 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int x, y;
        
        while(true){
            x = scan.nextInt();
            y = scan.nextInt();
            if(x == y){
                break;
            }
            else{
                if(x > y){
                    System.out.println("Decrescente");
                }
                else{
                    System.out.println("Crescente");
                }
            }
        }
    }
}
