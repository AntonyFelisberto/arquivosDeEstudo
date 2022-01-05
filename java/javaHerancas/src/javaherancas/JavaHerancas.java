package javaherancas;


public class JavaHerancas {

    public static void main(String[] args) {
        extensão exten=new extensão();
        exten.nomeMetodo();
    }
    public void metodo(){
                //nome do método que vai ser passado de herança pra outra classe
        System.out.printf("ola mundo\n");
    }
    public void idade(){
        int marca=(int) 11;
        float nascar=(float) 11.1;
        
        System.out.printf("hello world %d %.2f\n",marca,nascar);
    }
    public int arcas(){
        return 0;
    }
}
