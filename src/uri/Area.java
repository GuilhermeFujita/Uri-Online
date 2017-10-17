package uri;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Area {
    
    /*
    a) a área do triângulo retângulo que tem A por base e C por altura. 
    b) a área do círculo de raio C. (pi = 3.14159) 
    c) a área do trapézio que tem A e B por bases e C por altura. 
    d) a área do quadrado que tem lado B. 
    e) a área do retângulo que tem lados A e B. 
    */
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat();
        df.applyPattern("0.000");
        double a, b, c;
         a = scan.nextDouble();
         b = scan.nextDouble();
         c = scan.nextDouble();
        final double pi = 3.14159;
        double triangulo, circulo, quadrado, trapezio, retangulo;
        triangulo = (a * c) /2;
        circulo = pi * Math.pow(c, 2);
        trapezio = ((a+b)*c)/2;
        quadrado = Math.pow(b, 2);
        retangulo = a * b;
        System.out.println("TRIANGULO: " + df.format(triangulo));
        System.out.println("CIRCULO: " + df.format(circulo));
        System.out.println("TRAPEZIO: " + df.format(trapezio));
        System.out.println("QUADRADO: " + df.format(quadrado));
        System.out.println("RETANGULO: " + df.format(retangulo));
        
    }
}
