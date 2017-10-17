package uri;

import java.util.Scanner;

public class Media1 {
    
    public static void main(String[] args) {
        
        double A, B, MEDIA;
        //A pesa 3.5
        // B pesa 7.5
        //SOMA pesos 11
        Scanner scan = new Scanner(System.in);
        A = scan.nextDouble();
        B = scan.nextDouble();
        MEDIA = ((A * 3.5) + (B * 7.5))/11;
        System.out.printf("MEDIA = %.5f\n", MEDIA);
        
    }
}
