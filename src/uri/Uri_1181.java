package uri;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Guilherme Sant Ana Fujita
 * @data 01/10/2017
 * @description Linha na matriz 1181
 */
public class Uri_1181 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        DecimalFormat df = new DecimalFormat("0.0");
        Scanner scan = new Scanner(System.in);
        final int linha = 12;
        final int coluna = 12;
        double valores[][] = new double[linha][coluna];
        double soma = 0, media = 0;

        int escolha = scan.nextInt();
        char operacao = scan.next().charAt(0);

        for (int i = 0; i < valores.length; i++) {
            for (int j = 0; j < valores.length; j++) {
                valores[i][j] = scan.nextDouble();
            }
        }

        switch (operacao) {
            case 'S':
                for (int i = 0; i < valores.length; i++) {
                    for (int j = 0; j < valores.length; j++) {
                        soma += valores[escolha][j];
                    }
                }
                System.out.println(df.format(soma));
                break;
            case 'M':
                for (int i = 0; i < valores.length; i++) {
                    for (int j = 0; j < valores.length; j++) {
                        media = (media + valores[escolha][j]) / 12;
                    }
                }
                System.out.println(df.format(media));
                break;
        }
    }
}
