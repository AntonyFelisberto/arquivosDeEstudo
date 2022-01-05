package instancias;

public class Instancias {
    public static void main(String[] args) {
        int adr=11;
        float adm=(float) 1.9;
        boolean asd=false;
        SobrecargaMetodos chama=new SobrecargaMetodos();
        //nome da outra classe java        
        SobrecargaMetodos chamar=new SobrecargaMetodos(adr);
                                                      //verifica qual o parametro e vai acionar a partir de qual valor foi inserido
        SobrecargaMetodos chamada=new SobrecargaMetodos(adm,asd);
    }
    
}
