package uri;

import java.util.Scanner;

/**
 *
 * @author Guilherme Sant Ana Fujita
 * @data 07/09/2017
 * @description Sequências Crescentes -  1146
 */
public class Uri_1146 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        do {
            num = scan.nextInt();
            if (num == 0) {
                break;
            } else {
                for (int i = 1; i < num; i++) {
                    System.out.print(i + " ");
                }
                System.out.printf("%d\n", num);
            }
        } while(true);
    }
}
