package uri;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Guilherme Sant Ana Fujita
 * @description Salario - 1009
 */
public class Uri_1009 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat();
        df.applyPattern("0.00");
        String nome;
        double salario, totalVendas, total;
        final double porcentagem = 0.15;
        nome = scan.nextLine();
        salario = scan.nextDouble();
        totalVendas = scan.nextDouble();
        total = salario + (totalVendas * porcentagem);
        System.out.println("TOTAL = R$ " + df.format(total));
        
        
    }
}
