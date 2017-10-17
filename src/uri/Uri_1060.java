
package uri;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Guilherme Sant Ana Fujita
 * @data 01/09/2017 
 */
public class Uri_1060 {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        double num[] = new double[6];
        int cont = 0;
        for(int i=0; i< num.length; i++){
            num[i] = scan.nextDouble();
            if(num[i] > 0){
                cont++;
            }
        }
        System.out.printf("%d valores positivos\n", cont);
    }
}
