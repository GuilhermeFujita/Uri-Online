
package uri;

import java.util.Scanner;

/**
 *
 * @author Guilherme Sant Ana Fujita
 * @data 17/09/2017
 * @description System of a Download
 */
public class Uri_2582 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int c = scan.nextInt();
        
        for(int i=0; i< c; i++){
            int x = scan.nextInt();
            int y = scan.nextInt();
            int musica = x + y;
            switch(musica){
                case 0: System.out.println("PROXYCITY"); break;
                case 1: System.out.println("P.Y.N.G."); break;
                case 2: System.out.println("DNSUEY!"); break;
                case 3: System.out.println("SERVERS"); break;
                case 4: System.out.println("HOST!"); break;
                case 5: System.out.println("CRIPTONIZE"); break;
                case 6: System.out.println("OFFLINE DAY"); break;
                case 7: System.out.println("SALT"); break;
                case 8: System.out.println("ANSWER!"); break;
                case 9: System.out.println("RAR?"); break;
                case 10: System.out.println("WIFI ANTENNAS"); break;
            }
        }
    }
}
