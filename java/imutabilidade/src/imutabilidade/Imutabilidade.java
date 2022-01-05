package imutabilidade;

import java.util.Arrays;

public class Imutabilidade {

    public static void main(String[] args) {
        int valores[]={1,2,3,4,5};
        int valor=0;
        
        //BIBLIOTECA ARRAY TEM VARIAS USABILIDADES VALE A PENA DAR UMA OLHADA NELA
        
       Arrays.stream(valores).filter(numero->numero%2==0).map(numero->numero*2).forEach(numero->System.out.println(numero));
       
       for(int i=0;i<valores.length;i=i+1){
           if(valores[i]%2==0){
               valor=valores[i]*2;
               if(valor!=0){
                   System.out.printf("valores %d\n",valor);
               }
           }
           
       }
       /*
          cria um vetor e insere seus valores
          int valores[]={1,2,3,4,5};
         
          //COM LAMBDA
          Arrays.stream(valores)                                    // é usado para obter um Sequential Stream do array passado como parâmetro com seus elementos.
             .filter(numero->numero%2==0)                           //o filter do Java usado para filtrar dados de um objeto do tipo Map//CRIA O VALOR NUMERO,ARMAZENA OS DADOS DO ARRAY E FILTRA OS NUMEROS QUE NUMERO MOD 2 É IGUAL A 0
                .map(numero->numero*2)                              //Map é uma interface usada para armazenar dados em um par chave-valor//SE O NUMERO PASSAR PELO FILTRO ENTÃO O NUMERO RECEBE NUMERO VEZES 2//SE NÃO FOR ELE VOLTA PRO CICLO ATE TERMINAR OS DADOS CONTIDOS NO VETOR
                    forEach(numero->System.out.println(numero))     //forEach passa por todos os parametros do numero até ele chagar no final//IMPRIME O NUMERO E VOLTA PRO CICLO ATE TERMINAR OS DADOS CONTIDOS NO VETOR
           
          o -> separa os parâmetros (lado esquerdo) da implementação (lado direito).
          //SEM LAMBDA
          for(int i=0;i<valores.length;i=i+1){                      //CRIA UM FOR PRA PERCORRER TODO O TEMANHO(LENGTH) DO VETOR
             if(valores[i]%2==0){                                   //VERIFICA SE VALORES POSIÇÃO I MOD 2 É IGUAL A 0
               valor=valores[i]*2;                                 //VALOR RECEBE VALORES POSIÇÃO I VEZES 2
               if(valor!=0){                                       //VERIFICA SE O VALOR É DIFERENTE DE 0
                   System.out.printf("valores %d\n",valor);        //IMPRIME OS VALORES
               }
           }
           
       }
       */
    }
    
}
