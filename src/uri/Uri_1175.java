package uri;

import java.util.Scanner;

/**
 *
 * @author Guilherme Sant Ana Fujita
 * @data 06/10/2017
 * @description Troca em Vetor I - 1175
 */
public class Uri_1175 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        final int tam = 20;
        int n[] = new int[tam];

        int apInicio, apFim, aux;

        for (int i = 0; i < n.length; i++) {
            n[i] = scan.nextInt();
        }
        apInicio = 0;
        apFim = tam - 1;

        while (apInicio < apFim) {
            aux = n[apInicio];
            n[apInicio] = n[apFim];
            n[apFim] = aux;
            apInicio++;
            apFim--;
        }

        for (int i = 0; i < n.length; i++) {
            System.out.printf("N[%d] = %d\n", i, n[i]);
        }
    }
}
