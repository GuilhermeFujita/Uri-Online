
package uri;

import java.util.Scanner;

/**
 *
 * @author Guilherme Sant Ana Fujita
 * @data 01/09/2017 
 */
public class Uri_1070 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int i=1;
        while(i <=6) {
            if(x %2 ==0){
                x++;
                System.out.println(x);
            }
            else{
                x+=2;
                System.out.println(x);
            }
            i++;
        }
    }
}
