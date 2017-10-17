package uri;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Guilherme Sant Ana Fujita
 * @data 06/09/2017
 */
public class Uri_1040 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat();
        df.applyPattern("0.0");

        double n1 = scan.nextDouble();
        double n2 = scan.nextDouble();
        double n3 = scan.nextDouble();
        double n4 = scan.nextDouble();

        double media = ((n1 * 2) + (n2 * 3) + (n3 * 4) + (n4 * 1)) / 10;
        System.out.println("Media: " + df.format(media));
        if (media >= 7.0) {
            System.out.println("Aluno aprovado.");
        } else if (media < 5.0) {
            System.out.println("Aluno reprovado.");
        } else {
            System.out.println("Aluno em exame.");
            double exame = scan.nextDouble();
            System.out.println("Nota do exame: " + df.format(exame));
            double mediaExame = (media + exame) / 2;
            if (mediaExame >= 5.0) {
                System.out.println("Aluno aprovado.");
                System.out.println("Media final: " + df.format(mediaExame));
            } else {
                System.out.println("Aluno reprovado.");
                System.out.println("Media final: " + df.format(mediaExame));
            }
        }
    }
}
