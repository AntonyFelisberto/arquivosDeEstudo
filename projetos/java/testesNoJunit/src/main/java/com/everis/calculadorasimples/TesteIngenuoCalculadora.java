package com.everis.calculadorasimples;

public class TesteIngenuoCalculadora {

    public static void main(String[] args) {
        
        Calculadora calculadora = new Calculadora();  //instanciando a classe calculadora

        if (temErroNaSoma(calculadora)) {//validando a função
            System.exit(1);//saida com erro
        }
        
        if (subtracaoEstaOK(calculadora) == false) {//validando a função
            System.out.println("\n\n## Houve um erro na validação da soma ##\n\n");//se erro for verdadeiro mostra a mensagem
            System.exit(1);//saida com erro
        }
        System.out.println("\n\n==> Todos os testes passaram <==");//se tudo for executado corretamente mostra a mensagem
        System.exit(0);//saida sem erro
    }

    private static boolean temErroNaSoma(Calculadora calc) {
        boolean temErro = false;
        if (calc.soma(2,2) != 4) {          //validando a função
            temErro = true;                 //executando a variavel para dizer que houve erro
        }
        if (calc.soma(2,-2) != 0) {         //validando a função
            temErro = true;                 //executando a variavel para dizer que houve erro
        }
        if (calc.soma(-2,2) != 0) {         //validando a função
            temErro = true;                 //executando a variavel para dizer que houve erro
        }
        if (calc.soma(-2,-2) != -4) {       //validando a função
            temErro = true;                 //executando a variavel para dizer que houve erro
        }
        if (calc.soma(0,0) != 0) {          //validando a função
            temErro = true;                 //executando a variavel para dizer que houve erro
        }
        if (temErro) {
            System.out.println("\n\n## Houve um erro na validação da soma ##\n\n");     //se erro for verdadeiro mostra a mensagem
        }
        return temErro;     //retorna a variavel
    }

    private static boolean subtracaoEstaOK(Calculadora calc) {
        if (calc.subtrai(2, 2) != 0) {//validando a função
            return false;             //executando o retorno para dizer que houve erro
        }
        if (calc.subtrai(2, -2) != 4) {//validando a função
            return false;              //executando o retorno para dizer que houve erro
        }
        if (calc.subtrai(-2, 2) != -4) {//validando a função
            return false;               //executando o retorno para dizer que houve erro
        }
        if (calc.subtrai(-2, -2) != 0) {//validando a função
            return false;               //executando o retorno para dizer que houve erro
        }
        if (calc.subtrai(0, 0) != 0) {//validando a função
            return false;             //executando o retorno para dizer que houve erro
        }
        return true;        //executando o retorno para dizer que tudo correu bem
    }

}
