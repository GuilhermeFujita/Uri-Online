
package uri;

import java.util.Scanner;

/**
 *
 * @author Guilherme Sant Ana Fujita
 * @data 31/08/2017 
 */
public class Uri_1020 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        
        int dia, mes, ano;
        ano = num / 365;
        mes = (num - (ano *365))/ 30;
        dia = (num - (365*ano)) - (mes*30);
        System.out.println(ano + " ano(s)\n" + mes +" mes(es)\n" + dia + " dia(s)");
    }
}
