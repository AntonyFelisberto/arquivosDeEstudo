package aprendizadoEmJava;

import java.util.ArrayList;

public class ReleasesJava {
   public void texto(String nome,String sobrenome) {
	 var nomePessoa=String.format("%s %s",nome,sobrenome); 
	 				//String.format() esta formatando o arquivo pra ele ficar corretamente como foi imposto
   }
   public static void leitura(int ...numero) {
	   							  //esses 3 pontos indica um vetor,seria a mesma coisa que int vetor[],ou char nome[] ou String nome[] ...
	    						  
	   int numeros=0;
	   if(numero.length<0){
		   //.length  é usado em vetores e Strings alem de arrays
		   for(int num:numero) {
			   //usando for each
		   }
		   for(numeros=0;numeros<numero.length;numeros=numeros+1) {
			   //usando for normal
		   }
	   }
   }
   public void array(ArrayList array) {
	   				 //passando como parametro um array
   }
}
