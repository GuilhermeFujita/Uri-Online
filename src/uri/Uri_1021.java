
package uri;

import java.util.*;
/**
 *
 * @author Guilherme Sant Ana Fujita
 * @data 01/09/2017 
 */
public class Uri_1021 {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
       Scanner scan = new Scanner(System.in);

       double numero, resto100, resto50, resto20, resto10, resto5, resto2,
               restomoeda1, restomoeda05, restomoeda025, restomoeda010,
               restomoeda005, restomoeda001;
       int nota100, nota50, nota20, nota10, nota5, nota2, moeda1,
               moeda50, moeda25, moeda10, moeda5, moeda001;

       numero = scan.nextDouble();     
       
       System.out.println("NOTAS:");

       resto100 = numero % 100;
       nota100 = (int) numero / 100;
       System.out.println(nota100 + " nota(s) de R$ 100.00");

       resto50 = resto100 % 50;
       nota50 = (int) resto100 / 50;
       System.out.println(nota50 + " nota(s) de R$ 50.00");

       resto20 = resto50 % 20;
       nota20 = (int) resto50 / 20;
       System.out.println(nota20 + " nota(s) de R$ 20.00");

       resto10 = resto20 % 10;
       nota10 = (int) resto20 / 10;
       System.out.println(nota10 + " nota(s) de R$ 10.00");

       resto5 = resto10 % 5;
       nota5 = (int) resto10 / 5;
       System.out.println(nota5 + " nota(s) de R$ 5.00");

       resto2 = resto5 % 2;
       nota2 = (int) resto5 / 2;
       System.out.println(nota2 + " nota(s) de R$ 2.00");

       System.out.println("MOEDAS:");
       
       
       resto2 += 0.001; // Resolve o arredodamento
       
       restomoeda1 = (resto2 % 1.00);
       moeda1 = (int) (resto2 / 1.00);
       System.out.println(moeda1 + " moeda(s) de R$ 1.00");

       restomoeda05 = (restomoeda1 % 0.50);
       moeda50 = (int) (restomoeda1 / 0.50);
       System.out.println(moeda50 + " moeda(s) de R$ 0.50");

       restomoeda025 = (restomoeda05 % 0.25);
       moeda25 = (int) (restomoeda05 / 0.25);
       System.out.println(moeda25 + " moeda(s) de R$ 0.25");

       restomoeda010 = (restomoeda025 % 0.10);
       moeda10 = (int) (restomoeda025 / 0.10);
       System.out.println(moeda10 + " moeda(s) de R$ 0.10");

       restomoeda005 = (restomoeda010 % 0.05);
       moeda5 = (int) (restomoeda010 / 0.05);
       System.out.println(moeda5 + " moeda(s) de R$ 0.05");

       restomoeda001 = (restomoeda005 %0.01);
       moeda001 = (int) (restomoeda005 /0.01);
       System.out.println(moeda001 + " moeda(s) de R$ 0.01");
    }
}
