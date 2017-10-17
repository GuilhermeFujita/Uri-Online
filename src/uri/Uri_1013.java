package uri;

import static java.lang.Math.abs;
import java.util.Scanner;

/**
 *
 * @author Guilherme Sant Ana Fujita
 * @description Maior - 1013
 */
public class Uri_1013 {
    
    public static void main(String[] args) {
        
        int a, b, c, maior;
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        
        maior = (a+b+abs(a-b))/2;
        maior = (maior+c+abs(maior-c))/2;
        System.out.printf("%d eh o maior\n", maior);
    }
}
