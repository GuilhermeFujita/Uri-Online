
package uri;

import java.util.Scanner;

/**
 *
 * @author Guilherme Sant Ana Fujita
 * @data 17/09/2017
 * @description Sequência de números e soma - 1101
 */
public class Uri_1101 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int menor, maior, soma=0;
        
        while(true){
            int m = scan.nextInt();
            int n = scan.nextInt();
            if(m <= 0 || n <=0){
                break;
            }
            else{
                if(m >n){
                     menor = n;
                     maior = m;
                }
                else{
                    menor = m;
                    maior = n;
                }
                for(int i= menor; i<=maior; i++){
                    System.out.print(i + " ");
                    soma = soma + i;
                }
                System.out.printf("Sum=%d\n", soma);
                soma = 0;
            }
        }
    }
}
