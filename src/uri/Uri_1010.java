package uri;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Guilherme Sant Ana Fujita
 * @description Calculo - 1010
 */
public class Uri_1010 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat();
        df.applyPattern("0.00");
        
        int n1, qtd1, n2, qtd2;
        double p1,p2, total;
        
        n1 = scan.nextInt();
        qtd1 = scan.nextInt();
        p1 = scan.nextDouble();
        n2 = scan.nextInt();
        qtd2 = scan.nextInt();
        p2 = scan.nextDouble();
        total = (qtd1 * p1) + (qtd2 * p2);
        System.out.println("VALOR A PAGAR: R$ " + df.format(total));
        
    }
}
