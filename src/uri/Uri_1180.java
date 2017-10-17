package uri;

import java.util.Scanner;

/**
 *
 * @author Guilherme Sant Ana Fujita
 * @data 08/09/2017
 * @description Menor e Posição - 1180
 */
public class Uri_1180 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tam = scan.nextInt();
        int v[] = new int[tam];
        int menor, posicao = 0;

        menor = v[0];
        for (int i = 0; i < v.length; i++) {
            v[i] = scan.nextInt();
            if (v[i] < menor) {
                menor = v[i];
                posicao = i;
            }
        }
        System.out.println("Menor valor: " + menor);
        System.out.println("Posicao: " + posicao);

    }
}
