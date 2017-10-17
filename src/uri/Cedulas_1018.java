
package uri;

import java.util.Scanner;

/**
*
* @autor Anderson Silva Brino
* @data 15/08/2017
* @horario 16:48:11
*/
public class Cedulas_1018 {

   public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);

       int numero, not100, not50, not20, not10, not5, not2, not1,
               resto100, resto50, resto20, resto10, resto5, resto2, resto1;
       
       numero = scan.nextInt();
       
       System.out.println(numero);
       
       resto100 = numero % 100;
       not100 = numero / 100;
       System.out.println(not100 + " nota(s) de R$ 100,00");
       
       resto50 = resto100%50;
       not50 = resto100/50;
       System.out.println(not50 + " nota(s) de R$ 50,00");
       
       resto20 = resto50%20;
       not20 = resto50/20;
       System.out.println(not20 + " nota(s) de R$ 20,00");
       
       resto10 = resto20%10;
       not10 = resto20/10;
       System.out.println(not10 + " nota(s) de R$ 10,00");
       
       resto5 = resto10%5;
       not5 = resto10/5;
       System.out.println(not5 + " nota(s) de R$ 5,00");
       
       resto2 = resto5%2;
       not2 = resto5/2;
       System.out.println(not2 + " nota(s) de R$ 2,00");
       
       resto1 = resto2%1;
       not1 = resto2/1;
       System.out.println(not1 + " nota(s) de R$ 1,00");

   }
}