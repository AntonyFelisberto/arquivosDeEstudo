
package trabalhandocomdatas;

import java.util.Calendar;

public class Calendario {
    public Calendario(){
        //calendar é uma classe abstrata que prove métodos para converter uma data
        Calendar calendario;//alguns métodos podem ser instanciados sem o calendar
        Calendar calendarios=Calendar.getInstance();//já outros precisam de um retorno
        System.out.println(calendarios);
        
        calendarios.add(Calendar.DATE, -15);//-15 é o numero de dias anterior ao seu//pode ser possitivos tambem mas dai vai ser após a data
        System.out.println(calendarios.getTime());
        
        calendarios.add(Calendar.MONTH, 4);
        System.out.println(calendarios.getTime());
    
        calendarios.add(Calendar.YEAR, 7);
        System.out.println(calendarios.getTime());
        
        System.out.println("calendario mais completo: "+calendarios);
       
    } 
    
    public void executado(){
        System.out.println("executado com sucesso");
    }
}
