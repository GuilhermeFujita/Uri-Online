package uri;

import java.util.Scanner;

/**
 *
 * @author Guilherme Sant Ana Fujita
 * @data 03/09/2017
 */
public class Uri_1078 {

    public static void main(String[] args) {
        int num;
        Scanner scan = new Scanner(System.in);
        num = scan.nextInt();
        for (int i = 1; i <= 10; i++) {
            int res = i*num;
            System.out.print(i + " x " + num + " = " + res + "\n");
        }
    }
}
