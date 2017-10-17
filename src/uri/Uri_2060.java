package uri;

import java.util.Scanner;

/**
 *
 * @author Guilherme Sant Ana Fujita
 * @data 26/09/2017
 * @description Desafio de Bino 2060
 */
public class Uri_2060 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int mult2 = 0, mult3 = 0, mult4 = 0, mult5 = 0;
        int quantidade = scan.nextInt();
        int num[] = new int[quantidade];
        
        for(int i=0; i < num.length; i++){
            num[i] = scan.nextInt();
            if(num[i] % 2 ==0){
                mult2++;
            }
            if(num[i] % 3 == 0){
                mult3++;
            }
            if(num[i] % 4 == 0){
                mult4++;
            }
            if(num[i] % 5 == 0){
                mult5++;
            }
        }
        
        System.out.printf("%d Multiplo(s) de 2\n", mult2);
        System.out.printf("%d Multiplo(s) de 3\n", mult3);
        System.out.printf("%d Multiplo(s) de 4\n", mult4);
        System.out.printf("%d Multiplo(s) de 5\n", mult5);
    }
}
