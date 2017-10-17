package uri;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Guilherme Sant Ana Fujita
 * @data 10/09/2017
 * @description Galopeira - 2147
 */
public class Uri_2147 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US); 
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat();
        df.applyPattern("0.00");

        int c = scan.nextInt();
        String lixo = scan.nextLine();
        double tempo=0;
        
        for (int i = 0; i < c; i++) {
            String texto = scan.nextLine();
            int tamanho = texto.length();
            tempo = tamanho/100.0;
            System.out.println(df.format(tempo));
        }
    }
}
