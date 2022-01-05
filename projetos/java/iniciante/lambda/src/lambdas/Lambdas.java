package lambdas;

import java.util.function.Function;

public class Lambdas {

    public static void main(String[] args) {
       //COM LAMBDA
       Function<Integer,Object>buscar=id->new Object(); 
    }
    
    //SEM LAMBDA
    public static Object busca(int id){
        return new Object();
    }
}
