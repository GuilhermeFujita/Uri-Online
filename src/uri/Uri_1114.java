
package uri;

import java.util.Scanner;

/**
 *
 * @author Guilherme Sant Ana Fujita
 * @data 07/09/2017
 * @description Senha Fixa - 1114
 */
public class Uri_1114 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        while(true){
            num = scan.nextInt();
            if(num == 2002){
                System.out.println("Acesso Permitido");
                break;
            }
            else{
                System.out.println("Senha Invalida");
            }
        }
    }
}
