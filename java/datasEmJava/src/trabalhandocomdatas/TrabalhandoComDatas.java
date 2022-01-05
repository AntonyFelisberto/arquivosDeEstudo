package trabalhandocomdatas;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
import javax.swing.JOptionPane;
public class TrabalhandoComDatas {

    public static void main(String[] args) {
        Date datas=new Date(); //instanciando a classe date//possui varios metodos ja implementados
        System.out.print(datas); //imprime a data e hora  
        Long milles=System.currentTimeMillis();//traz os milisegundos em que foi executado de acordo com seu sistema        
        System.out.println(milles);//printa os milisegundos em que foi executado de acordo com seu sistema        
        Date data=new Date(milles);//vai trazer a data e os milisegundos       
        System.out.println(data);//vai printar a data e os milisegundos       
        
        Date dataNoPassado = new Date();        
        Date dataNoFuturo = new Date();        
        boolean depois=dataNoPassado.after(dataNoFuturo);//retorna verdadeiro se a dataNoPassado se passar depois de  dataNoFuturo       
        boolean antes=dataNoPassado.before(dataNoFuturo);//retorna verdadeiro se a dataNoPassado se passar antes de  dataNoFuturo    
        System.out.println("antes "+antes);
        System.out.println("depois "+depois);
   
        Date dataInicioP = new Date();
        System.out.println(dataInicioP);
        Instant instant =dataInicioP.toInstant();//Instant é um tipo wrapper //
        System.out.println(instant);
        
        //Local Date padrão yyyy-mm-dd
        LocalDate dia=LocalDate.now();//local date tambem é um wrapper(tipos especiais de variaveis que já possuem métodos e classes prontos,um exemplo de wrapper é o String)
        System.out.println(dia);
        LocalDate Data,ontem;
        LocalDate hoje=LocalDate.now();//algumas vezes você tem que nomeara variavel e já inserir o método pois alguns só são disponibilizados com retorno
        ontem=hoje.minusDays(5);
        System.out.println(hoje);
        System.out.println(ontem);
        //LocalTime
        LocalTime tempo=LocalTime.now();
        System.out.println(tempo);
        LocalTime tempoAdicionado=LocalTime.now();
        System.out.println(tempoAdicionado.plusHours(5));
        //LocalDateTime
        LocalDateTime atual=LocalDateTime.now();
        System.out.println(atual);
        LocalDateTime modificado=atual.minusDays(1).minusHours(2);
        System.out.println(modificado);
        
        int resposta;
        int s;
        resposta = JOptionPane.showConfirmDialog(null, "isso foi util pra você");
        if(resposta==JOptionPane.YES_OPTION){// verifica se o usuário clicou no botão YES
            System.out.println("muito obrigado");
        }else{
            System.out.println("que pena, sinto muito :)");
        }  
        s=Integer.parseInt(JOptionPane.showInputDialog("quer continuar 1-sim 2-não"));//tem que converter pois só aceita String
        switch(s){
            case 1:
                Calendario calendario=new Calendario();//forma comum de instanciar
                calendario.executado();
                new FormatandoDatas().executado();//outra forma de instanciar
                System.out.println("----------------------------------------------------------------------------------");
            break;
            case 2:
                System.out.println("----------------------------------------------------------------------------------");
                System.out.println("ok adeus");
                System.out.println("----------------------------------------------------------------------------------");
            break;
            default:
                System.out.println("resposta incorreta");
                System.out.println("----------------------------------------------------------------------------------");
            break;
        }
    }
    
}
