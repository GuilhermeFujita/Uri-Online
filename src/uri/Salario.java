package uri;

import java.util.Scanner;
import java.text.*;

public class Salario {
    
    public static void main(String[] args) {
        
        int numero, Totalhoras;
        double salario, valor;
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat();
        df.applyPattern("0.00");
        numero = scan.nextInt();
        Totalhoras = scan.nextInt();
        valor = scan.nextDouble();
        salario = (Totalhoras * valor);
        System.out.println("NUMBER = " + numero);
        System.out.println("SALARY = U$ " + df.format(salario));
        
    }
}
