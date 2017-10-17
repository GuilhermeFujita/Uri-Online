
package uri;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Guilherme Sant Ana Fujita
 * @data 07/09/2017 
 * @description Dividindo X por Y - 1116
 */
public class Uri_1116 {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat();
        df.applyPattern("0.0");
        
        int num = scan.nextInt();
        int x, y;
        double resultado;
        for(int i=0; i < num; i++) {
            x = scan.nextInt();
            y = scan.nextInt();
            if(y == 0){
                System.out.println("divisao impossivel");
            }
            else{
                resultado = x / (double)y;
                System.out.println(df.format(resultado));
            }
            
        }
    }
}
