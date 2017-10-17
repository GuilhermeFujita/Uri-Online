package uri;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AreaCirculo {
    
    public static void main(String[] args) {
        final double pi = 3.14159;
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat();
        df.applyPattern("0.0000");
        double raio, area;
        raio = scan.nextDouble();
        area = pi * Math.pow(raio,2);
        System.out.println("A="+ df.format(area));
        
    }
}
