/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juroscompostos;

import java.util.Scanner;

/**
 *
 * @author VP
 */
public class JurosCompostos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Double valorFuturo,valorPresente,tempo,taxa; 
       
        Scanner ler=new Scanner(System.in);
        System.out.println("digite o valor presente:");
        valorPresente=ler.nextDouble();
        System.out.println("digite o valor do tempo:");
        tempo=ler.nextDouble();
        System.out.println("digite o valor da taxa:");
        taxa=ler.nextDouble();
        valorFuturo=valorPresente*Math.pow((1+taxa/100),tempo);
        System.out.printf("valor total foi :%.2f",valorFuturo);
        
    }
    
}
