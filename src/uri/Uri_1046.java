
package uri;

import java.util.Scanner;

/**
 *
 * @author Guilherme Sant Ana Fujita
 * @data 15/09/2017
 * @description Tempo de Jogo - 1046
 */
public class Uri_1046 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int horaInicio = scan.nextInt();
        int horaFim = scan.nextInt();
        int duracao= -1;
        
        if(horaInicio == horaFim){
            duracao = 24;
        }
        else if(horaFim > horaInicio){
            duracao = horaFim - horaInicio;
        }
        else{
            duracao = (24 - horaInicio) + horaFim;
        }
        System.out.printf("O JOGO DUROU %d HORA(S)\n", duracao);
    }
}
