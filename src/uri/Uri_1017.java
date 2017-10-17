package uri;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Guilherme Sant Ana Fujita
 * @description Gasto de Combustível - 1017
 */
public class Uri_1017 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat();
        df.applyPattern("0.000");
        
        final double km = 12.0; 
        int tempoViagem, velocidade;
        double litros;
        tempoViagem = scan.nextInt();
        velocidade = scan.nextInt();
        litros = (tempoViagem * velocidade)/km;
        System.out.println(df.format(litros));
        
        
    }
}
