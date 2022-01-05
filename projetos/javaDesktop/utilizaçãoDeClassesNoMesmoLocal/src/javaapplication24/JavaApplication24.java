package javaapplication24;
import java.util.Random;
import java.util.Scanner;

class mm{
    
    void pen(int vetor[][],int nao){
        int i,j;
        System.out.printf("elementos na matriz:\n");
        for(i=0;i<=1;i++){
          for(j=0;j<nao;j=j+1){
              System.out.printf("%d-",vetor[i][j]);
            
        }
           System.out.printf("\n");
        }
    }
    
}
public class JavaApplication24 {

    
    public static void main(String[] args) {
        Random srd=new Random(100);
        Scanner ler=new Scanner(System.in);
        int vetor[][];
        int i,j,sim,nao;
        System.out.printf("digite o numero de colunas que a matriz tera\n");
        sim=ler.nextInt();
        nao=sim;
        vetor=new int [2][sim];
        for(i=0;i<=1;i=i+1){
            for(j=0;j<sim;j=j+1){
                vetor[i][j]=srd.nextInt(100);
            }
        }
        mm bus=new mm();
        bus.pen(vetor,nao);

  System.out.println("Digite a quantidade de termos\n"); 
  int n1 = 5, n2 = 6; 
  for (i = 0; i <=4; i++) { 
      System.out.print(n1 +" "+"\n"); 
      int n3 = n1 + n2;
      n1 = n2; 
      n2 = n3;
  } System.out.printf("Fim");
}
}