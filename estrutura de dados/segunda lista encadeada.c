#include<stdio.h>
#include <stdlib.h>
#include<locale.h>

struct nomes{
	long long int nume1,nume2;
	long long int nume3;
	struct nomes *p;
};
typedef struct nomes no;

void insere (long long int m,long long int n,no*chamada){
	if(chamada->p==NULL){
	    no *begin;
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
		printf("primeiro numero inserido: %lld\n",chamada->p->nume1);
		printf("segundo numero inserido: %lld\n",chamada->p->nume2);
		printf("multiplicação dos numeros inseridos: %lld\n",chamada->p->nume3);
		mostrar(chamada->p);
	}
}

int main(void){
	setlocale(LC_ALL,"portuguese");
	no *chamada;
	chamada=malloc(sizeof(no));
	chamada->p=NULL;
	
    FILE *arq; 
    arq = fopen("calculation.txt", "r");
	
	long long int m=0,n=0;
    if(arq==NULL){
    	printf("não existe arquivo");
	}else{
	while ((fscanf(arq,"%lld %lld", &m, &n)) !=EOF){
		 insere (m,n,chamada);
	  mostrar(chamada);
	}
    }
       fclose(arq);
    }
