
package uri;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Guilherme Sant Ana Fujita
 * @data 01/10/2017
 * @description Senha -  2146
 */
public class Uri_2146 {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String linha;
        while((linha =br.readLine()) != null){
            int senha = Integer.parseInt(linha);
            senha = senha -1;
            System.out.println(senha);
        }
    }
}
