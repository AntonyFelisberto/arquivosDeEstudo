/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usandolengthemlaçocontrario;

import java.util.Scanner;

/**
 *
 * @author VP
 */
public class UsandoLengthEmLaçoContrario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lerDados=new Scanner(System.in);
        int total,i;
        total=lerDados.nextInt();
        int vetor[]=new int[total];
        for(i=0;i<total;i=i+1){
            vetor[i]=lerDados.nextInt();
        }
        System.out.println("oiii");
        for(i=vetor.length-1/*você sempre faz o total -1 pra ele poder ler os valores corretamente*/;i>=0;i--){
            
            System.out.printf("%d\n",vetor[i]);
        }
        for(i=total-1;i>=0;i=i-1){
           /*você sempre faz o total -1 pra ele poder ler os valores corretamente, é igual ao for do incremento que quando você não sabe o total insere - 1 na condição aqui você insere no inicio*/ 
            System.out.printf("%d\n",vetor[i]);
        }
    }
    
}
