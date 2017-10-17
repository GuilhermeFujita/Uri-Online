package uri;

import java.util.Scanner;

/**
 *
 * @author Guilherme Sant Ana Fujita
 * @data 08/09/2017
 * @description Par ou Ímpar - 1074
 */
public class Uri_1074 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Par EVEN
        //Impar ODD
        //Positivo POSITIVE
        //Negativo NEGATIVE

        int n = scan.nextInt();
        int x;
        for (int i = 0; i < n; i++) {
            x = scan.nextInt();
            if (x > 0 && x % 2 == 0) {
                System.out.println("EVEN POSITIVE");
            } else if (x < 0 && x % 2 == 0) {
                System.out.println("EVEN NEGATIVE");
            } else if (x > 0 && x % 2 != 0) {
                System.out.println("ODD POSITIVE");
            } else if (x < 0 && x % 2 != 0) {
                System.out.println("ODD NEGATIVE");
            } else {
                System.out.println("NULL");
            }
        }
    }
}
