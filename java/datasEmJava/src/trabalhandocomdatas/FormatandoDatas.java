package trabalhandocomdatas;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatandoDatas extends Calendario{
    public FormatandoDatas(){
        Date agora=new Date();
        String dataPstring=DateFormat.getInstance().format(agora);//formatando a data pro nosso tipo
        System.out.println(dataPstring);
        dataPstring=DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.SHORT).format(agora);//formatando a data pro nosso tipo
        System.out.println(dataPstring);
        
        SimpleDateFormat formatarData = new  SimpleDateFormat("dd/MM/yyyy");//formatando a data pra como você quer que apareça
        String recebeDataFormatada=formatarData.format(agora);
        System.out.println(recebeDataFormatada);
        
    }
    public void executadoTambem(){
        super.executado();
    }
}
