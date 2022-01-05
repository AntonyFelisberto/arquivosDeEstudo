/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastro;

import java.time.LocalDate;

/**
 *
 * @author VP
 */
public class dados extends Validacao {
    private String nomes,cpfs,enderecos;
    private float rendas;
    private LocalDate data;
    public void setvalide(String nome,String cpf,String endereco,LocalDate novadata,float renda){
        this.data=novadata;
        this.cpfs=cpf;
        this.enderecos=endereco;
        this.nomes=nome;
        this.rendas=renda;
    }
    @Override
    public void validados() {
        String status = null;
        int y = 10;
        int soma = 0;
        char Acpf [] = new char [11];
        for(int i = 0; i < cpfs.length(); i++) {
           Acpf[i]=cpfs.charAt(i);
        }
       int icpf[] = new int [11];
       for (int i=0; i<11; i++){
         icpf[i]= Character.getNumericValue(Acpf[i]);
       }
       for (int i=0; i<9; i++) {
        soma = soma + (icpf[i]*y);
        y= y-1;
       }
        int dig1 = (soma*10)% 11;
       if (dig1 == 10){
          dig1 = 0;
          y = 11;
          soma = 0;
       for (int i=0;i<10; i++){
         soma = soma + (icpf[i]*y);
         y = y-1;
       }
       }
       int dig2 = (soma*10)% 11;
       if (dig2 == 10){
         dig2 = 0;
       }
       if ( (dig1==icpf[9]) && (dig2 == icpf[10])){
                    System.out.print("seu cpf esta correto");
       }
       else{
            System.out.print("seu cpf esta incorreto");
       }
   }

    @Override
    public void setitens() {
        
    }
     @Override
    public void getvalides() {
       System.out.printf("mostrando dados\n");
        System.out.printf("data"+data+"\n");
         System.out.printf("cpf %s\n",cpfs);
          System.out.printf("endereço %s\n",enderecos);
           System.out.printf("rendas %.2f\n",rendas);
    }
    
    
}
