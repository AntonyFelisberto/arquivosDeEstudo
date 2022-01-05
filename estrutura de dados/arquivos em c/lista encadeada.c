#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<windows.h>
struct noo{
	char espedicao[100];
	struct noo*pontero;
};
typedef struct noo no;

void insere (char Linha[],no*chamada){
	if(chamada->pontero==NULL){
	 no*pro;
     pro=malloc(sizeof(no));
     strcpy(pro->espedicao,Linha);
     pro->pontero=chamada->pontero;
     chamada->pontero=pro;
    }else{
       insere (Linha,chamada->pontero);
	}
}
void mostrar (no*chamada){
	printf("\n");
	if(chamada->pontero!=NULL){
		printf("%s",chamada->pontero->espedicao);
		printf("\n");
		sleep(1);
		no*morta;
		morta=chamada->pontero;
		chamada->pontero=morta->pontero;
		mostrar(chamada);
	}
}
main(){
  no*chamada;
  chamada=malloc(sizeof(no));
  chamada->pontero=NULL;
  FILE *arquivo;
  char Linha[100];
  char *result;
  char resp;
  int i=1;
  arquivo = fopen("arquivo.txt", "rt");
  if (arquivo == NULL) {
     printf("Problemas na abertura do arquivo\n");
  }
  while (!feof(arquivo)){
	  // Lê uma linha (inclusive com o '\n')
      result = fgets(Linha, 100, arquivo);// o 'fgets' lê até 99 caracteres ou até o '\n'
      if (result) // Se foi possível ler
	  //printf("Linha %d : %s",i,Linha);
	  insere (Linha,chamada);
      i++;
  }
  printf("quer que mostre os elementos ?\n");
  scanf("%s",&resp);
  switch(resp){
  	case 's':
  		mostrar (chamada); 
  	break;
  	default:
  		printf("resposta invalida\n");
  	break;
  }
  fclose(arquivo);
}
