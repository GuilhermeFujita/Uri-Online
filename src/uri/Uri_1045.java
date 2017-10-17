package uri;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Guilherme Sant Ana Fujita
 * @data 25/09/2017
 * @description Tipos de Triângulo - 1045
 */
public class Uri_1045 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        double valores[] = new double[3], aux;

        for (int i = 0; i < valores.length; i++) {
            valores[i] = scan.nextDouble();
        }

        for (int i = 0; i < valores.length; i++) {
            for (int j = 0; j < valores.length - 1; j++) {
                if (valores[j] < valores[j + 1]) {
                    aux = valores[j];
                    valores[j] = valores[j + 1];
                    valores[j + 1] = aux;
                }
            }
        } // Fim for

        double a = valores[0];
        double b = valores[1];
        double c = valores[2];

        if (a >= (b + c)) {
            System.out.println("NAO FORMA TRIANGULO");
        } else if (Math.pow(a, 2) == (Math.pow(b, 2) + Math.pow(c, 2))) {
            System.out.println("TRIANGULO RETANGULO");
            if (a == b && b == c && c == a) {
                System.out.println("TRIANGULO EQUILATERO");
            }
            else if (a == b || a == c || b == c) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }
        else if (Math.pow(a, 2) > (Math.pow(b, 2) + Math.pow(c, 2))) {
            System.out.println("TRIANGULO OBTUSANGULO");
            if (a == b && b == c && c == a) {
                System.out.println("TRIANGULO EQUILATERO");
            }
            else if (a == b || a == c || b == c) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }
        else if (Math.pow(a, 2) < (Math.pow(b, 2) + Math.pow(c, 2))) {
            System.out.println("TRIANGULO ACUTANGULO");
            if (a == b && b == c && c == a) {
                System.out.println("TRIANGULO EQUILATERO");
            }
            else if (a == b || a == c || b == c) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }
    }
}
