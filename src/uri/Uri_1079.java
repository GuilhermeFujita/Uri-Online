
package uri;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Guilherme Sant Ana Fujita
 * @data 08/09/2017
 * @description Médias Ponderadas - 1079
 */
public class Uri_1079 {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        DecimalFormat df = new DecimalFormat();
        df.applyPattern("0.0");
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        double n1, n2, n3, media;
        final int peso = 10;
        for(int i =0; i< n; i++){
            n1 = scan.nextDouble();
            n2 = scan.nextDouble();
            n3 = scan.nextDouble();
            media = (n1*2 + n2*3+ n3*5)/peso;
            System.out.println(df.format(media));
        }
    }
}
