package uri;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Guilherme Sant Ana Fujita
 * @data 15/09/2017
 * @description Preenchimento de Vetor III - 1178
 */
public class Uri_1178 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US); 
        Scanner scan = new Scanner(System.in);
        
        
        double x;
        double n[] = new double[100];
        
        x = scan.nextDouble();
        n[0] = x;
        double anterior = n[0];
        
        for(int i = 1; i<n.length; i++){
            n[i] = anterior/2;
            anterior = n[i];
        }
        
        for(int i=0; i<n.length; i++){
            System.out.printf("N[%d] = %.4f\n", i, n[i]);
        }
    }
}
