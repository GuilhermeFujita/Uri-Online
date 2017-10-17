package uri;

import java.util.Scanner;

public class ProdutoSimples {
    
    public static void main(String[] args) {
        
        int A, B, PROD;
        Scanner scan = new Scanner(System.in);
        A = scan.nextInt();
        B = scan.nextInt();
        PROD = A * B;
        System.out.println("PROD = " + PROD);
        
    }
}
