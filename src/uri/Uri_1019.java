
package uri;

import java.util.Scanner;

/**
 *
 * @author Guilherme Sant Ana Fujita
 * @data 31/08/2017 
 */
public class Uri_1019 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        
        int horas, minutos, segundos;
        final int segundosHora = 3600;
        final int minutosHora = 60;
        
        horas = num/3600; //3600 - quantidade de seg em 1h
        minutos = (num - (horas * segundosHora))/minutosHora; // acha os segundos das horas, subtrai e divide
        segundos = (num-(horas * segundosHora)) - (minutos * minutosHora);
        System.out.printf("%d:%d:%d\n", horas, minutos, segundos);
    }
}
