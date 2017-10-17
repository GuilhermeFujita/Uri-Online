
package uri;

/**
 *
 * @author Guilherme Sant Ana Fujita
 * @data 14/09/2017
 * @description Sequência IJ 1 - 1095
 */
public class Uri_1095 {
    
    public static void main(String[] args) {
        
        int i=1;
        for(int j=60; j>=0; j=j-5){
            System.out.printf("I=%d J=%d\n", i, j);
            i = i+3;
        }
    }
}
