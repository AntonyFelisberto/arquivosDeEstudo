
package enumsemjava;

public class EnumsEmJava {

    public static void main(String[] args) {
        //classes do tipo enum não podem ser instanciadas
        //os dados de classe enum são imutaveis
        //seus construtores são sempre private
        //seus acessos são feitos de forma estatica exemplo:Carro.FUSCA
        System.out.println(Carro.VECTRA);
        System.out.println(Carro.STRADA);
        //é possivel tambem fazer verificações com os enums
        System.out.println(Carro.valueOf("VECTRA"));
        //tambem é possivel fazer um for para percorrer todos os itens que estão na lista
        for(Carro carros:Carro.values()){
            //instancia o carro com a classe enum//percorre todos os valores contidos no enum
            System.out.println("Tipo: "+carros);
        }
        //pegar resultados contidos nos métodos dos enum
        System.out.println("Código das estatisticas:OPEN "+Estatisticas.OPEN.getTexto());
        System.out.println("Código das estatisticas:CLOSE "+Estatisticas.CLOSE.getCod());
    }
    
}
