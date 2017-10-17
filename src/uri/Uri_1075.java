
package uri;

import java.util.Scanner;

/**
 *
 * @author Guilherme Sant Ana Fujita
 * @data 07/09/2017 
 * @description Resto 2 - 1075
 */
public class Uri_1075 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i = 0; i <10000; i++){
            if(i % n == 2){
                System.out.println(i);
            }
        }
    }
}
