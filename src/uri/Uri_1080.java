
package uri;

import java.util.Scanner;

/**
 *
 * @author Guilherme Sant Ana Fujita
 * @data 07/09/2017 
 * @description Maior e Posição - 1080
 */
public class Uri_1080 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num[] = new int[100];
        int posicao=0, maior=0;
        for(int i=0; i<num.length; i++){
            num[i] = scan.nextInt();
            if(num[i] > maior){
                maior = num[i];
                posicao = i;
            }
        }
        System.out.println(maior);
        System.out.println(posicao+1);
    }
}
