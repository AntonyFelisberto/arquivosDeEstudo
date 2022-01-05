package javaherancas;

public class extensão extends JavaHerancas{
    public extensão(){
        arca();
        //chamando um dos metodos da propria classe
        super.metodo();
        //super pra chamar o método//ponto e o método que a classe de herança recebe
    }
    public void nomeMetodo(){
         //qualquer método que você criar pode receber as heranças
        super.idade();
    }
    public void arca(){
         //qualquer método e variavel que você criar pode receber as heranças
        int m=super.arcas();
        System.out.printf("%d\n",m);
    }
}
