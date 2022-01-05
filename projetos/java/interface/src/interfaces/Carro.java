package interfaces;

public interface Carro {
    
    String nome();
   
    default void Buzinar(){
        System.out.println("biiibiibibibibibi");
    }
}
