
package uri;

/**
 *
 * @author Guilherme Sant Ana Fujita
 * @data 17/10/2017 
 * @description Sequência IJ 2 - 1096
 */
public class Uri_1096 {
    
    public static void main(String[] args) {
        
        int i = 1;
        while(i<=9){
            for(int j=7; j>=5; j--){
                System.out.printf("I=%d J=%d\n", i, j);
            }
            i+=2;
        }
    }
}
