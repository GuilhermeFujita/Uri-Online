
package uri;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Guilherme Sant Ana Fujita
 * @data 06/09/2017 
 */
public class Uri_1064 {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        DecimalFormat df = new DecimalFormat();
        df.applyPattern("0.0");
        Scanner scan = new Scanner(System.in);
        double num[] = new double[6];
        int contNum=0, contMedia=0;
        double media = 0;
        
        for(int i=0; i<num.length; i++){
            num[i] = scan.nextDouble();
            if(num[i] >0){
                contNum++;
                contMedia++;
                media+= num[i];
            }
        }
        System.out.println(contNum+ " valores positivos");
        System.out.println(df.format(media/contMedia));   
    }
}
