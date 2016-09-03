/*
4.  Fazer  um  algoritmo  para  calcular  a  média  final  (média  aritmética)
de  um  aluno, considerando a realização de quatro avaliações. 
 */
package O1_Estruturas_Sequenciais;

import java.util.Scanner;

/**
 * @author luizfelipeacacio
 */
public class Questao04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double n1,n2,n3,n4,media;
        
        System.out.println("N1:");
        n1 = sc.nextDouble();
        
        System.out.println("N2:");
        n2 = sc.nextDouble();
        
        System.out.println("N3:");
        n3 = sc.nextDouble();
        
        System.out.println("N4:");
        n4 = sc.nextDouble();
        
        media = (n1+n2+n3+n4)/4; 
        System.out.println("Média final: "+media);
    
    }
}
