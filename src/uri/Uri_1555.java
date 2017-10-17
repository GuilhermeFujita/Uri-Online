
package uri;

import java.util.Scanner;

/**
 *
 * @author Guilherme Sant Ana Fujita
 * @data 17/09/2017 
 * @description Funções - 1555
 */
public class Uri_1555 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        
        for(int i=0; i < n; i++){
            int x = scan.nextInt();
            int y = scan.nextInt();
            
            double r = (3*x * 3*x)+ (y * y);
            double b = 2 * (x*x) + (5*y * 5*y);
            double c = -100*x + Math.pow(y, 3);
            
            if(r > b && r >c){
                System.out.println("Rafael ganhou");
            }
            else if(b > r && b > c){
                System.out.println("Beto ganhou");
            }
            else{
                System.out.println("Carlos ganhou");
            }
        }
    }
}
