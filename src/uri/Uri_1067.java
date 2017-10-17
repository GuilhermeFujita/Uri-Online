
package uri;

import java.util.Scanner;

/**
 *
 * @author Guilherme Sant Ana Fujita
 * @data 01/09/2017 
 */
public class Uri_1067 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        for(int i=0; i<=x; i++){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }
    }
}
