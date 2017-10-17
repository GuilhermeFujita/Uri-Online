
package uri;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Guilherme Sant Ana Fujita
 * @data 29/09/2017
 * @description Cachorros Quentes - 2234
 */
public class Uri_2234 {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        DecimalFormat df = new DecimalFormat();
        df.applyPattern("0.00");
        Scanner scan = new Scanner(System.in);
        
        double h = scan.nextDouble();
        int p = scan.nextInt();
        double media = h/p;
        
        System.out.println(df.format(media));
    }
}
