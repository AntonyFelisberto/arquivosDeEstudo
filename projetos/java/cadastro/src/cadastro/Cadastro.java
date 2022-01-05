/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastro;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class Cadastro {

    
    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
        String nome,cpf,endereco,datahoje;
        int tamcpf,tamdata,tamdereco;
        float renda;
        System.out.printf("digite seu nome:");
        nome=ler.nextLine();
        do{
         System.out.printf("digite seu cpf:");
         cpf=ler.nextLine();
         tamcpf=cpf.length();
        }while(tamcpf<14);
        do{
            System.out.printf("digite a data de hoje:");
            datahoje=ler.nextLine();
            tamdata=datahoje.length();
        }while(tamdata!=10);
         DateTimeFormatter formatando=DateTimeFormatter.ofPattern("dd/MM/yyyy");
         LocalDate novadata=LocalDate.parse(datahoje,formatando);
         System.out.printf("digite seu endereço:");
         endereco=ler.nextLine();
         tamdereco=endereco.length();
         if(tamdereco==0){
             do{
               System.out.printf("digite seu endereço:");
               endereco=ler.nextLine();
               tamdereco=endereco.length();
             }while(tamdereco==0);
         }
         System.out.printf("digite sua renda:");
         renda=ler.nextFloat();
         cpf=cpf.replaceAll(",","");
         cpf=cpf.replaceAll(" ","");
         cpf=cpf.replaceAll("-","");
         cpf=cpf.replaceAll("\\.","");
         dados chamar=new dados();
         chamar.setvalide(nome, cpf, endereco, novadata, renda);
         chamar.validados();
         chamar.setitens();
         chamar.getvalides();
        
        
        
    }
    
}
