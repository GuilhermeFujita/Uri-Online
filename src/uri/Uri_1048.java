package uri;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Guilherme Sant Ana Fujita
 * @data 07/09/2017
 * @description Aumento de salário - 1048
 */
public class Uri_1048 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        DecimalFormat df = new DecimalFormat();
        df.applyPattern("0.00");
        Scanner scan = new Scanner(System.in);
        double salario = scan.nextDouble();
        double novoSalario, reajuste, percentual = 0;

        if (salario >= 0 && salario <= 400) {
            percentual = 0.15;
            novoSalario = salario + (salario * percentual);
            reajuste = (salario * percentual);
        } else if (salario >= 400.01 && salario <= 800) {
            percentual = 0.12;
            novoSalario = salario + (salario * percentual);
            reajuste = (salario * percentual);
        } else if (salario >= 800.01 && salario <= 1200) {
            percentual = 0.1;
            novoSalario = salario + (salario * percentual);
            reajuste = (salario * percentual);
        } else if (salario >= 1200.01 && salario <= 2000) {
            percentual = 0.07;
            novoSalario = salario + (salario * percentual);
            reajuste = (salario * percentual);
        } else {
            percentual = 0.04;
            novoSalario = salario + (salario * percentual);
            reajuste = (salario * percentual);
        }

        System.out.println("Novo salario: " + df.format(novoSalario));
        System.out.println("Reajuste ganho: " + df.format(reajuste));
        percentual = percentual * 100;
        System.out.printf("Em percentual: %.0f %%\n", percentual);
    }
}
