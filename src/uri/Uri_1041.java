
package uri;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Guilherme Sant Ana Fujita
 * @data 01/09/2017 
 */
public class Uri_1041 {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        double x = scan.nextDouble();
        double y = scan.nextDouble();
        
        if(x == 0.0 && y == 0.0){
            System.out.print("Origem\n");
        }
        else if(x == 0 && y != 0){
            System.out.print("Eixo Y\n");
        }
        else if(x !=0 && y == 0){
            System.out.print("Eixo X\n");
        }
        else if(x >0.0&& y>0.0){
            System.out.print("Q1\n");
        }
        else if(x < 0.0 && y > 0.0){
            System.out.print("Q2\n");
        }
        else if(x < 0.0 && y < 0.0){
            System.out.print("Q3\n");
        }
        else {
            System.out.print("Q4\n");
        }
    }
}
