package uri;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Guilherme Sant Ana Fujita
 * @description Distância entre dois pontos - 1015
 */
public class Uri_1015 {

    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat();
        df.applyPattern("0.0000");
        Scanner scan = new Scanner(System.in);
        double x1, x2, y1, y2, distancia;
        x1 = scan.nextDouble();
        x2 = scan.nextDouble();
        y1 = scan.nextDouble();
        y2 = scan.nextDouble();
        distancia = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
        System.out.println(df.format(distancia));

    }
}
