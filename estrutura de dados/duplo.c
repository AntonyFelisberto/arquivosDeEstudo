#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#define DADO 10000000000
struct dados{
	char nome[35];
	char cpf[11];
	char senha[35];
	char email[50];
    char telefone[11];
    struct dados *p;
    struct dados *a;
};
typedef struct dados dupla;

void insere (dupla *chamada,char nomes[],char senhas[],char emails[],char cpfs[],char telefones[]){
	if(chamada->p==NULL){
		dupla *nova;
		nova=malloc(sizeof(dupla));
	    strcpy(nova->nome,nomes);
	    strcpy(nova->senha,senhas);
	    strcpy(nova->email,emails);
	    strcpy(nova->cpf,cpfs);
	    strcpy(nova->telefone,telefones);
	    nova->p=chamada->p;
	    chamada->p=nova;
	    nova->a=chamada;
	}else{
		dupla *nova;
		nova=malloc(sizeof(dupla));
	    strcpy(nova->nome,nomes);
	    strcpy(nova->senha,senhas);
		strcpy(nova->email,emails);
		strcpy(nova->cpf,cpfs);
	    strcpy(nova->telefone,telefones);
	    nova->p=chamada->p;
	    chamada->p->a=nova;
	    chamada->p=nova;
	    nova->a=chamada;
	}
}
void mostrar (dupla *chamada){
	if(chamada->p!=NULL){
		
		FILE*banco;
        banco=fopen("dados_de_banco.txt","w+");
        FILE*arquivo;
        arquivo=fopen("dados.txt","r+");
        
        char verificacao[]="NULL";
        char perfil[]="NULL";
        if(arquivo==NULL){
        	fprintf(banco,"sem nada\n");
		}else{
			printf("oiii");
		    fprintf(banco,"%s %s %s %s %s %i %s %s\n",chamada->p->nome,chamada->p->senha,chamada->p->email,chamada->p->cpf,chamada->p->telefone,rand()%DADO,verificacao,perfil);
		    mostrar(chamada->p);
	    }
	}
}
main(){
	char nome[35];
	char cpf[11];
	char senha[35];
	char email[50];
    char telefone[11];
	dupla *chamada;
	chamada=malloc(sizeof(dupla));
	chamada->p=NULL;
    FILE*arquivo;
    arquivo=fopen("dados.txt","r+");

    if(arquivo==NULL){
    	printf("vazio");
	}else{
	   while(fscanf(arquivo,"%s%s%s%s%s",&nome,&senha,&email,&cpf,&telefone)!=EOF){
    	insere(chamada,nome,senha,email,cpf,telefone);
    	mostrar(chamada);
	   }
	}
    
    
}
