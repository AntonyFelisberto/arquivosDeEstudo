package javainterfaces;

public class JavaInterfaces implements criarInterface {
                            //pra incrementar a interface você tem que colocar implements e o nome da interface
    public static void main(String[] args) {
        
    }
    @Override
    public void listar(int x){
        int i,j;
        for(i=0;i<x;i++){
           for(j=0;j<=10;j=j+1){
             System.out.printf("%d x %d=%d",i,j,(i*j));   
           }
        }
    }
}
