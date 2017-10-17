
package uri;

import java.util.Scanner;

/**
 *
 * @author Guilherme Sant Ana Fujita
 * @data 19/09/2017
 * @description Tipo de Combustivel - 1134
 */
public class Uri_1134 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int codigo=0;
        int alcool=0, gasolina=0, diesel=0;
        
        while(true){
            if(codigo == 4){
                break;
            }
            else{
                codigo = input.nextInt();
                while(codigo <1 && codigo >4){
                    input.nextInt();
                }
                switch(codigo){
                    case 1: alcool++; break;
                    case 2: gasolina++; break;
                    case 3: diesel++; break;
                }
            }
        }
        
        System.out.println("MUITO OBRIGADO");
        System.out.printf("Alcool: %d\nGasolina: %d\nDiesel: %d\n", alcool, gasolina, diesel);
    }
}
