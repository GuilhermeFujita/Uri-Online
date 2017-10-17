
package uri;

import java.util.Scanner;

/**
 *
 * @author Guilherme Sant Ana Fujita
 * @data 06/09/2017 
 */
public class Uri_2160 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String texto = scan.nextLine();
        int tamanho = texto.length();
        if(tamanho >80){
            System.out.println("NO");
        }
        else{
            System.out.println("YES");
        }
    }
}
