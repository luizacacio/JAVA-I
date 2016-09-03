/*
2.  Fazer  um  algoritmo  para  calcular  a  soma  entre  dois  números  e  multiplicar  o 
resultado pelo primeiro. 
 */
package O1.Estruturas_Sequenciais;

import java.util.Scanner;

/**
 * @author luizfelipeacacio
 */
public class Questao02 {
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);
        float n1,n2;
        
        System.out.println("N1:");
        n1 = sc.nextFloat();
        
        System.out.println("N2:");
        n2 = sc.nextFloat();
        
        System.out.println("Resposta: " + ((n1+n2)*n1));
    }
    
}
