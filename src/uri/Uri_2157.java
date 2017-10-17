package uri;

import java.util.Scanner;

/**
 *
 * @author Guilherme Sant Ana Fujita
 * @data 18/09/2017
 * @description Sequência espelho - 2157
 */
public class Uri_2157 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int casos = scan.nextInt();
        String sequencia = "";
        String reverso = "";
        int x = 0;
        int inicio, fim;

        do {
            inicio = scan.nextInt();
            fim = scan.nextInt();
            for (int j = inicio; j <= fim; j++) {
                sequencia = sequencia + j;
            }
            reverso = new StringBuilder(sequencia).reverse().toString();
            System.out.println(sequencia + reverso);
            sequencia = "";
            x++;
        } while (x < casos);
    }
}
