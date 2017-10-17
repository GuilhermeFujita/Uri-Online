
package uri;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Guilherme Sant Ana Fujita
 * @data 13/09/2017
 * @description Zerinho ou Um - 1467
 */
public class Uri_1467 {
    
    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        
        String linha;
        
        while((linha = br.readLine()) != null){
            if(linha.equals("1 0 0") || linha.equals("0 1 1")){
                System.out.println("A");
            }
            else if(linha.equals("0 1 0") || linha.equals("1 0 1")){
                System.out.println("B");
            }
            else if(linha.equals("0 0 1") || linha.equals("1 1 0")){
                System.out.println("C");
            }
            else{
                System.out.println("*");
            }
        }
    }
}
