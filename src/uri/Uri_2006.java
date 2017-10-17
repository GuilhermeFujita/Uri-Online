package uri;

import java.util.Scanner;

/**
 *
 * @author Guilherme Sant Ana Fujita
 * @data 29/09/2017
 * @description Identificando o chá
 */
public class Uri_2006 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();

        int res[] = new int[5];
        int corretas = 0;
        for (int i = 0; i < res.length; i++) {
            res[i] = scan.nextInt();
            if (res[i] == t) {
                corretas++;
            }
        }
        System.out.println(corretas);
    }
}
