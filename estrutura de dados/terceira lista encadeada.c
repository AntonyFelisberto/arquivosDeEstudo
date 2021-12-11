#include<stdio.h>
#include <stdlib.h>
#define MAX 10000
#include<locale.h>
struct nomes{
	int nume1,nume2;
	int nume3;
	struct nomes*p;
};
typedef struct nomes no;

void insere (int m,int n,no*chamada){
	if(chamada->p==NULL){
	    no*begin;
		begin=malloc(sizeof(no));
		begin->nume1=m;	
		begin->nume2=n;
		begin->nume3=m * n;
		begin->p=chamada->p;
		chamada->p=begin;
	}else{
		insere(m,n,chamada->p);
	}
}
void mostrar (no*chamada){
	if(chamada->p!=NULL){
		printf("primeiro numero inserido: %i\n",chamada->p->nume1);
		printf("segundo numero inserido: %i\n",chamada->p->nume2);
		printf("multiplicação dos numeros inseridos: %i\n",chamada->p->nume3);
		mostrar(chamada->p);
	}
}
int main(void){
	setlocale(LC_ALL,"portuguese");
	
	no*chamada;
	chamada=malloc(sizeof(no));
	chamada->p=NULL;
	
    FILE *arq; 
    arq = fopen("calculation.txt", "w");
	
	int i,m,n;
	
    for(i=0; i<MAX; i++){
      srand(time(NULL));
      m=rand() % MAX*10; 
	  n=rand() % MAX*10;
	  insere (m,n,chamada);
	  mostrar(chamada);
      fprintf(arq,"%i %i\n",m,n);
    }

    fclose(arq);
    return(0);
}
