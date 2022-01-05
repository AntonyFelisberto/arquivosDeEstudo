package javaDadosCastOperadores;

public class Dados {
		//Capacidades e tipos
	    //inteiros
	byte numero=-100;
	byte numeroB=100;
	
	short numeroS=-10000;
	short numeroSh=10000;
	
	int numeroI=-1000000000;
	int numeroIn=1000000000;
	
	long numeroL=-1000000000000000000L;//coloca o L pra identificar que é long mas na hora do usuario fornecer uma valor não precisa
	long numeroLo=1000000000000000000L;
	  //flutuantes ou seja com .
	float flut=-1000.0F;//coloca o F pra identificar que é float mas na hora do usuario fornecer uma valor não precisa
	float flutF=10.7F;
	
	double dub=-1000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000.0;
	double dubD=1000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000.0;

       //caracteres
    char car='n';					//char so recebe um valor e só recebem valores ou seja não podem ser usados em entradas
    char caracteres[]=new char[50]; //caso queira armazenar mais de um caractere tera que usar um vetor
    
    String texto="pode receber caracteres ilimitados e de qualquer tipo";
    
       //logicos
    boolean verdade=true;
    boolean falso=false;
    
}
