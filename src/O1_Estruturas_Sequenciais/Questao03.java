/*
3.  Fazer  um  algoritmo  para  receber  um  valor  em  dólar  e converter  esse  valor  em 
real. 
 */
package O1_Estruturas_Sequenciais;

import java.util.Scanner;

/**
 * @author luizfelipeacacio
 */
public class Questao03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double dolar,cotacao,real;
        
        System.out.println("Valor da Cotação: ");
        cotacao = sc.nextDouble();
        
        System.out.println("Valor do Dolar: ");
        dolar   = sc.nextDouble();
        
        real    = dolar * cotacao; 
        System.out.println(real);
        
        
    }
    
}
