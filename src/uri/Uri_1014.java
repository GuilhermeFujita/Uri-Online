package uri;

import java.text.DecimalFormat;
import java.util.Scanner;
/**
 *
 * @author Guilherme Sant Ana Fujita
 * @description Consumo - 1014
 */
public class Uri_1014 {
   
    public static void main(String[] args) {
        
        int distancia;
        double combustivel, consumo;
        
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat();
        df.applyPattern("0.000");
        distancia = scan.nextInt();
        combustivel = scan.nextDouble();
        consumo = distancia/combustivel;
        System.out.println(df.format(consumo) + " km/l");
        
    }
}
