/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcoesnaclasseprincipal;

/**
 *
 * @author VP
 */
public class FuncoesNaClassePrincipal {

    public static void main(String[] args) {
        
        nomeDaFuncao();
        System.out.printf("arquivo %d",nomeDaFuncaoComParametroERetorno(1));
    }
    //caso queira criar uma função dentro da classe principal precisa colocar ela como static sempre
    public static void nomeDaFuncao(){
        System.out.println("arquivo executado");
    }
    public static int nomeDaFuncaoComParametroERetorno(int f){
        return 1+f;
    }
}
