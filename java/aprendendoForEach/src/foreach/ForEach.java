
package foreach;


public class ForEach {

    public static void main(String[] args) {
        String nome[]=new String[10];//cria um array de strings
        String nomes[]={"Kratos","Karina","Alanzoka","Jesus :)"};//cria um array de strings com valores ja estabelecidos
        int valor[]=new int[5];
        int valores[]={1,2,3,4,5};     
        long longos[]=new long[5];
        long longs[]={6,7,8,9,0};       
        boolean verdade[]=new boolean[5];
        boolean verdades[]={true,false,true,false,false};
        char  caracteres[]=new char[5];
        char  caracter[]={'a','b','c'};      
        Double dobroDoFloat[]=new Double[5];
        Double dobroDoFloats[]={1.0,1.3,4.5}; 
        float flutuantes[]={1,1,90,12};
        float flutuante[]=new float[5];       
        //da pra fazer arrays com quaisquer tipos//não só arrays como matrizes tambem
        //vamos ao foreach//pra usalo você tem que declarar uma variavel que seja do mesmo tipo do array para receber os dados dele
        //a variavelQueRecebeDados sempre tem que ser declarado no for
        for(String nomeado:nomes){
            //tipo variavelQueRecebeDados  : VariavelQuePassaOsDados
            System.out.println(nomeado);
        }
        for(int avaliar:valores){
            //tipo variavelQueRecebeDados  : VariavelQuePassaOsDados
            System.out.println(avaliar);
        }

    }
    
}
