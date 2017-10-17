package uri;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Guilherme Sant Ana Fujita
 * @data 13/09/2017
 * @description Idades - 1154
 */
public class Uri_1154 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat();
        df.applyPattern("0.00");

        //int n = scan.nextInt();
        int cont = 0;
        double soma = 0, media;
        int idade=0;

        while (idade >= 0) {
            idade = scan.nextInt();
            if (idade >= 0) {
                soma += idade;
                cont++;
            }
            else{
                break;
            }
        }
        media = soma / cont;
        System.out.println(df.format(media));
    }
}
