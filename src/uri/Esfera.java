package uri;

import java.util.Scanner;

public class Esfera {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double raio, volume;
        final double pi = 3.14159;
        raio = scan.nextDouble();
        volume = (4.0/3) * pi * Math.pow(raio, 3);
        System.out.printf("VOLUME = %.3f\n", volume);
    }
}
