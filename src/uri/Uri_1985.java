
package uri;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Guilherme Sant Ana Fujita
 * @data 15/09/2017
 * @description MacPRONALTS - 1985
 */
public class Uri_1985 {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US); 
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat();
        df.applyPattern("0.00");
        
        int n, codigo, quantidade;
        double preco=0, total=0;
        
        n = scan.nextInt();
        for(int i=1; i<=n; i++){
            codigo = scan.nextInt();
            quantidade = scan.nextInt();
            switch(codigo){
                case 1001: preco = 1.50; break;
                case 1002: preco = 2.50; break;
                case 1003: preco = 3.50; break;
                case 1004: preco = 4.50; break;
                case 1005: preco = 5.50; break;
            }
            total = total + (preco * quantidade);
        }
        System.out.println(df.format(total));
    }
}
