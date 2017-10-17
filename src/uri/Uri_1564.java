
package uri;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Guilherme Sant Ana Fujita
 * @data 12/09/2017 
 * @description Vai ter copa? 1564
 */
public class Uri_1564 {
    
    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        
        String linha;
        while((linha = br.readLine()) != null){
            int reclamacao = Integer.parseInt(linha);
            
            if(reclamacao == 0){
                System.out.println("vai ter copa!");
            }
            else{
                System.out.println("vai ter duas!");
            }
        }
    }
}
