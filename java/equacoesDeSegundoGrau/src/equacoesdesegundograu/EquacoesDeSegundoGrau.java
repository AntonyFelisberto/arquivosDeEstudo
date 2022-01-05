/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equacoesdesegundograu;

import java.util.Scanner;

/**
 *
 * @author VP
 */
public class EquacoesDeSegundoGrau {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
        int a,c;
        Double delta,b,x1,x2;
        
        System.out.println("Digite o valor de A");
        a=ler.nextInt();
        System.out.println("Digite o valor de B");
        b=ler.nextDouble();
        System.out.println("Digite o valor de C");
        c=ler.nextInt();
        
        delta=Math.pow(b, 2)-(4*a*c);
        x1=(-b+Math.sqrt(delta))/(2*a);
        x2=(-b-Math.sqrt(delta))/(2*a);
        System.out.println(x1);
        System.out.println(x2);
    }
    
}
