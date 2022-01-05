package interfacefuncional;

public class InterfaceFuncional {

    public static void main(String[] args) {
        funcao operar=valor->valor;
        //interface variavel=parametro->logica
//nome da sua lambda//mesmo nome inserido na interface
          //nome da variavel|é ele que é usado na chamada
                     //criação da variavel
    }
    
}
@FunctionalInterface                                //toda vez que você tentar colocar mais de um metodo dentro da interface a functional vai dizer que isso é errado e vai te avisar
interface funcao{                                   //você só usa uma lambda na interface
    String operar(String valor);
   // default Integer opere(String valor){}
}
