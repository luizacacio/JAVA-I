/*
1.  Fazer um algoritmo para calcular a soma entre dois números.
 */
package O1.Estruturas_Sequenciais;

import java.util.Scanner;

/**
 * @author luizfelipeacacio
 */
public class Questao01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n1,n2,soma; 
      
        System.out.println("N1: ");
        n1 = sc.nextFloat();
        
        System.out.println("N2: ");
        n2 = sc.nextFloat();
        
        soma = n1 + n2;
        System.out.println(soma);
        
    }
    
}
