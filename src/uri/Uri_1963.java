
package uri;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Guilherme Sant Ana Fujita
 * @data 25/09/2017
 * @description O Filme - 1963
 */
public class Uri_1963 {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        DecimalFormat df = new DecimalFormat();
        df.applyPattern("0.00");
        Scanner scan = new Scanner(System.in);
        
        double valorInicial = scan.nextDouble();
        double valorFinal = scan.nextDouble();
        double razao = valorFinal/valorInicial;
        double porcentagem = (razao-1)*100;
        
        System.out.println(df.format(porcentagem) + "%");
    }
}
