
package uri;

import java.util.Scanner;

/**
 *
 * @author Guilherme Sant Ana Fujita
 * @data 03/10/2017 
 */
public class Uri_1073 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        
        if(n % 2 !=0){
            n = n -1;
        }
        
        for(int i=2; i<=n; i= i+2){
            int res = (int) Math.pow(i, 2);
            System.out.printf("%d^%d = %d\n", i, 2, res);
        }
    }
}
