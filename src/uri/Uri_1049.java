
package uri;

import java.util.Scanner;

/**
 *
 * @author Guilherme Sant Ana Fujita
 * @data 03/09/2017 
 */
public class Uri_1049 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String p1, p2,p3;
        p1 = scan.nextLine();
        p2 = scan.nextLine();
        p3 = scan.nextLine();
        if(p1.equals("vertebrado")){
            if(p2.equals("ave")){
                if(p3.equals("carnivoro")){
                    System.out.println("aguia"); //carnivoro
                }
                else{
                    System.out.println("pomba"); // onívoro
                }
            }
            else if(p2.equals("mamifero")){
                if(p3.equals("onivoro")){
                    System.out.println("homem");
                }
                else{
                    System.out.println("vaca");
                }
            }
        } // fim if
        else{ //invertebrado
            if(p2.equals("inseto")){
                if(p3.equals("hematofago")){
                    System.out.println("pulga");
                }
                else if(p3.equals("herbivoro")){
                    System.out.println("lagarta");
                }
            }
            else if(p2.equals("anelideo")){
                if(p3.equals("hematofago")){
                    System.out.println("sanguessuga");
                }
                else if(p3.equals("onivoro")){
                    System.out.println("minhoca");
                }
            }
        }
    }
}
