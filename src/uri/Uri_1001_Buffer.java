
package uri;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Guilherme Sant Ana Fujita
 * @data 12/09/2017 
 */
public class Uri_1001_Buffer {
    
    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);
        
        int A, B, X;
        
        A = Integer.parseInt(in.readLine());
        B = Integer.parseInt(in.readLine());
        X = A + B;
        
        System.out.println("X = " + X);
    }
}
