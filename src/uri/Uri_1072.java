package uri;

import java.util.Scanner;

/**
 *
 * @author Guilherme Sant Ana Fujita
 * @data 03/09/2017
 */
public class Uri_1072 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int cont = 0, contIn = 0, contOut = 0;
        int x[] = new int[n];
        while (cont < n) {
            x[cont] = scan.nextInt();
            cont++;
        }
        for (int i = 0; i < x.length; i++) {
            if (x[i] >= 10 && x[i] <= 20) {
                contIn++;
            } else {
                contOut++;
            }
        }
        System.out.printf("%d in\n", contIn);
        System.out.printf("%d out\n", contOut);
    }
}
