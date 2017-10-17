
package uri;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Guilherme Sant Ana Fujita
 * @data 03/09/2017 
 */
public class Uri_1043 {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat();
        df.applyPattern("0.0");
        double a, b, c, area, perimetro;
        a = scan.nextDouble();
        b = scan.nextDouble();
        c = scan.nextDouble();
        //Verifica se é triangulo
        if((a<(b+c)) && (b< (a+c)) && (c< (a+b))){
            perimetro = a + b + c;
            System.out.println("Perimetro = " + df.format(perimetro));
        }
        else{
            area = (c*(a+b))/2;
            System.out.println("Area = " + df.format(area));
        }
    }
}
