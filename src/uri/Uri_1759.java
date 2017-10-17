package uri;

import java.util.Scanner;

/**
 *
 * @author Guilherme Sant Ana Fujita
 * @data 15/09/2017
 * @description Ho Ho Ho - 1759
 */
public class Uri_1759 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = 0;
        int x = scan.nextInt();

        while (i < x - 1) {
            System.out.print("Ho ");
            i++;
        }
        System.out.print("Ho!\n");
    }
}
