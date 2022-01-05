package tiporetorno;

public class Retorno {
    public final String dados;
           //variavel so pode ter 1 valor
    public Retorno(String receberDados){
        //metodo construtor
        this.dados=receberDados;
    }
    public String passarString(){
        return "retornando a string concatenada "+dados+" muito util";
    }
    public Float retornarWrapper(int x,String os){
        //retornando um wrapper
        switch(x){
            case 1:
                return (float) 1.000;
                //quando se usa o switch para retornar algo você não utiliza o break
            case 2:
                return (float) 1.99;
            case 3:
                switch(os){
                    case "ola":
                        return (float) 2.99;
                    case "o":
                        return (float) 00.00;
                    default:
                        return 00.0f;//mesma coisa de converter em float
                }
        }
        return (float) 1.00;
    }
    
    //valor não some da memoria
    public static int valorQueNaoSomeDaMemoria(){
        return 0;
    }
}
