package paradgmafuncional;

import java.util.function.UnaryOperator;

public class ParadgmaFuncional {

    public static void main(String[] args) {
        //COM LAMBDA
        //cria como se fosse uma função que vai ser chamada depois
        UnaryOperator<Integer>CalcularValor=valor->valor*3;
/*cria um operador , Ele representa uma função que recebe um argumento e opera sobre ele.
                 //tipo da variavel
                               //variavel
                                     //Recebe a variavel valor
                                            //valor recebe valor vezes 3
*/
        int valor=10;
        System.out.println(CalcularValor.apply(valor));
                          //CHAMA A FUNÇÃO.APLICA O VALOR(VALOR QUE QUER PASSAR COMO PARAMETRO)
        
      /*COM LAMBDA   
        UnaryOperator<Integer>CalcularValor=valor->valor*3;
        int valor=10;
        System.out.println(CalcularValor.apply(valor));
      /*SEM LAMBDA  
       int valor=10;    FAZ O VALOR RECEBER 10
       int resultado=valor*3;FAZ O resultado RECEBER VALOR VEZES 3
       System.out.println(resultado);IMPRIME O RESULTADO
     */ 
   }
    
}
