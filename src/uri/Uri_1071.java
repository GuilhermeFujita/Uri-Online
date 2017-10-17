package uri;

import java.util.Scanner;

/**
 *
 * @author Guilherme Sant Ana Fujita
 * @data 06/09/2017
 */
public class Uri_1071 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int soma = 0;
        if (x > y) {
            for (int i = x-1; i > y; i--) {
                if (i % 2 != 0) {
                    soma += i;
                }
            }
        }  if(y > x){
            for (int i = y-1; i >x; i--) {
                if (i % 2 != 0) {
                    soma += i;
                }
            }
        }
        System.out.println(soma);
    }
}
