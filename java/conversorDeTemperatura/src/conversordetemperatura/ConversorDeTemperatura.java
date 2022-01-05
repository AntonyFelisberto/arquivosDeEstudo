package conversordetemperatura;

import java.util.Scanner;

public class ConversorDeTemperatura {

    public static void main(String[] args) {
        float celsius,fahrenheit;
        Scanner ler=new Scanner(System.in);
        System.out.println("digite a temperatura em fahrenheit:");
        fahrenheit=ler.nextFloat();
        celsius=(fahrenheit-32)/9*5;
        System.out.printf("a conversão em celsius é %.2f graus ",celsius);
        
    }
    
}
