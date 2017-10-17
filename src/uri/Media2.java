package uri;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Media2 {
    
    public static void main(String[] args) {
        
        double A, B, C, MEDIA;
        //A pesa 2
        //B pesa 3
       //C pesa 5
       //SOMA 10
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat();
        df.applyPattern("0.0");
        A = scan.nextDouble();
        B = scan.nextDouble();
        C = scan.nextDouble();
        MEDIA = ((A * 2) + (B * 3) + (C * 5))/(2 + 3 + 5);
        System.out.println("MEDIA = " + df.format(MEDIA));
    }
}
