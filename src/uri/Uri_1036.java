package uri;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Guilherme Sant Ana Fujita
 * @description Fórmula de Bakara - 1036
 */
public class Uri_1036 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat();
        df.applyPattern("0.00000");
        double a, b, c, delta, x1, x2;
        
        a = scan.nextDouble();
        b = scan.nextDouble();
        c = scan.nextDouble();
        delta = Math.pow(b, 2) - 4 * a * c;
        if(delta < 0 || a == 0){
            System.out.println("Impossivel calcular");
        }
        else{
            double raiz = Math.sqrt(delta);
            x1 = (- b + raiz)/(2 *a);
            x2 = (-b - raiz) / (2* a);
            System.out.println("R1 = " + df.format(x1));
            System.out.println("R2 = " + df.format(x2));
        }
    }
}
