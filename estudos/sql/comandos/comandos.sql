/*
                              COMANDOS SQL
  SELECT                seleciona os itens da tabela que serão exibidos
  *                     seleciona todos os itens da tabela 
  FROM                  é que seleciona a tabela que possui os dados
  WHERE                 é o que faz a procura e condição para o comando ser executado
  DELETE                FROM deleta todos os dados da tabela
  LIKE                  procura os itens que são como o valor que você está procurando, pra usa-lo coloque LIKE 'valor'(o valor tem que estar exatamente assim) existem mais 3 formas de procura '%valor'(não se importa com o que vem antes do valor) 'valor%'(não se importa com o que vem depos do valor) '%valor%'(não se importa com o que vem antes e depois do valor) 
  DROP TABLE            deleta a tabela inteira
  ''                    comparação de valor
  ""                    mostrar e receber valor
  UPDATE                diz qual tabela vai ser atualizada
  SET                   diz quais os novos dados vão ser atribuidos a esses dados,nome do dado=valor
  INSERT INTO tabela()  diz a tabela no qual serão inseridos os dados,nome tabela(nome do atributo)
  VALUES()              diz qual valores serão inseridos na tabela
                              
                              FUNÇÕES(TODAS ESSAS FUNÇÕES PODEM SER USADAS UMA DENTRO DA OUTRA)
  AVG                   traz a média de tudo,AVG(nome do atributo)
  MAX                   traz o numero maximo,max(nome do atributo)
  MIN                   traz o menor numero,min(nome do atributo)
  SUM                   soma todos os numeros,sum(nome do atributo)
  ORDER BY              ordena a consulta a partir do atributo da tabela,ORDER BY nome do atributo tipo ordenação,tipo de ordenação pode ser ASC crescente ou DESC decrescente
  LIMIT                 limita o numero de linha que irá aparecer,limit numero
  OFFSET                pula um certo numero de registros a do valor que você colocou e deve ser usado com o limit,offset numero 
  LENGTH                traz o tamanho armazenado em cada atributo,length(nome do atributo)
  DISTINCT              traz somente atributos que são diferentes um dos outros,distinct(nome do atributo)
  COUNT                 faz uma contagem de quantos valores estão inseridos na tabela,count(nome do atributo)
  LOWER                 deixa as letras minusculas,lower(nome do atributo)
  UPPER                 deixa as letras maiusculas,upper(nome do atributo)
  SUBSTR                remover numeros de caracteres e selecionar quantos vão aparecer,substr(nome do atributo,a partir de qual caractere vai começar,quantos caracteres vão aparecer)           
  REPLACE               substituir um valor de caractere por outro ou por um espaço em branco,replace(nome do atributo,'caracteres que quer substituir','novos caracteres')                            
                              
                              OPERADORES
  and/or/not são operedores AND(um e o outro tem que ser verdadeiros e cumprir a condição) OR(um ou o outro tem que ser verdadeiros e cumprir a condição),NOT(nega o resultado esperado) usados depois de uma primeira condição no where
  condicionais{
        > maior
        = igual e recebe
        != or <> os dois significam diferente
        < menor
        >= maior ou igual
        <= menor ou igual
   }
   matematicos{
         +  mais
         -  menos
         %  mod(resto da divisão)
         /  dividir
         *  vezes
         () ordem de precendencia superior
   }
   ()                   esse operador significa que tudo que está dentro dele tem prioridade em ser executado primeiro exemplo: and nome="senhor" or(nome="senhora" and idade>=60)
*/

/*vai mostrar na tela o caractere que escrever */
SELECT "hello world";
/*vai mostrar na tela o numero que digitou */
SELECT 10;
/*vai mostrar na tela o numero que digitou */
SELECT 1.0;
/*o asterisco seleciona todos os itens da tabela */
SELECT * FROM pessoas;
/*seleciona o dados da tabela que você colocou mostrando na ordem em que foram colocados*/
SELECT primeiro_nome FROM pessoas;
/*seleciona o dados da tabela que você colocou mostrando na ordem em que foram colocados*/
SELECT primeiro_nome,ultimo_nome FROM pessoas;
/*seleciona o dados da tabela que você colocou mostrando na ordem em que foram colocados*/
SELECT ultimo_nome,primeiro_nome FROM pessoas;
/*deleta os dados da tabela(nunca fazer sem o where)*/
DELETE FROM pessoas WHERE primeiro_nome LIKE 'Kratos';
/*ele deleta a tabela inteira*/
DROP TABLE pessoas;
/*faz a atualização dos dados(nunca fazer update sem where)*/
UPDATE estados  SET nome_estado="GRÉCIA" ,sigla_estado="PG" ,nome_capital="OLYMPUS" WHERE nome_estado='Pará' AND sigla_estado='PA' AND nome_capital='Belém'; 
/*insere valores dentro da tabela*/
INSERT INTO pessoas(primeiro_nome,ultimo_nome,sigla_estado,camiseta_ou_chapeu,qte_pontos,nome_time,num_identificacao) VALUES("Kratos","pereira","AC","chapéu",2000,"azul",3200);
/*inserções simultaneas nas tabelas*/
INSERT INTO pessoas(primeiro_nome,ultimo_nome,sigla_estado,camiseta_ou_chapeu,qte_pontos,nome_time,num_identificacao) 
VALUES("Kratos","pereira","AC","chapéu",2000,"azul",3200),
      ("Zeus","pereira","RJ","chapéu",200,"roxo",5200),
      ("Poseidon","pereira","SP","chapéu",5000,"cinza",7200),
      ("Hades","pereira","PR","chapéu",8000,"vermelho",2200);
/*not nega o resulta esperado*/
SELECT * FROM pessoas WHERE NOT (primeiro_nome = 'Paula') OR qte_pontos>20;
/*ordena a consulta a partir de um certo dado*/
SELECT primeiro_nome FROM pessoas ORDER BY primeiro_nome DESC;
/*ordenar varios resultados*/
SELECT primeiro_nome,ultimo_nome FROM pessoas ORDER BY primeiro_nome DESC,ultimo_nome ASC;

SELECT primeiro_nome,ultimo_nome,qte_pontos FROM pessoas ORDER BY primeiro_nome DESC,ultimo_nome ASC,qte_pontos ASC;

/*limita o numero de linhas que irão aparecer*/
SELECT primeiro_nome FROM pessoas ORDER BY primeiro_nome DESC LIMIT 3;
/*pula o numero de linha que irião aparecer*/
SELECT primeiro_nome FROM pessoas ORDER BY primeiro_nome DESC LIMIT 15 OFFSET 5;
/*traz o tamanho armazenado em cada atributo*/
SELECT primeiro_nome,length(primeiro_nome) FROM pessoas;
/*traz somente atributos que são diferentes um dos outros*/
SELECT DISTINCT(primeiro_nome),length(primeiro_nome) FROM pessoas;
/*faz uma contagem de quantos valores estão inseridos na tabela*/
SELECT COUNT(DISTINCT(primeiro_nome)) as diferente FROM pessoas;
/*fazendo operações*/
SELECT 3 + 2;
SELECT 3 / 2;
SELECT 3 / 2.0;
SELECT 3 * 2;
SELECT 3 % 2;
SELECT 3 - 2;
/*operações com próprios atributos da tabela  (você poderia usar funções e qualquer outra coisa para agregar a essa seleção) os dados são modificados apenas na consulta*/
SELECT qte_pontos+num_identificacao FROM pessoas;
SELECT qte_pontos/num_identificacao FROM pessoas;
SELECT qte_pontos*num_identificacao FROM pessoas;
SELECT qte_pontos-num_identificacao FROM pessoas;
SELECT qte_pontos%num_identificacao FROM pessoas;
/*operações com numeros  (você poderia usar funções e qualquer outra coisa para agregar a essa seleção) os dados são modificados apenas na consulta*/
SELECT qte_pontos+10 FROM pessoas;
SELECT qte_pontos/10 FROM pessoas;
SELECT qte_pontos*10 FROM pessoas;
SELECT qte_pontos-10 FROM pessoas;
SELECT qte_pontos%10 FROM pessoas;
/*                explicando subquery
  subquery são comandos que agregam os atributos de uma mesma tabela
  geralmente precisamos deles em condições que necessitamos usar funções
  pois essas funções como MAX,MIN,SUM e AVG precisam de um select para serem rodadas
  exemplo:
  SELECT primeiro_nome,camiseta_ou_chapeu,qte_pontos FROM pessoas WHERE qte_pontos >= max(qte_pontos);
  
  O caso acima daria erro pois após o where seria necessario utilizar a subquerry

  SELECT primeiro_nome,camiseta_ou_chapeu,qte_pontos FROM pessoas WHERE qte_pontos >= (SELECT max(qte_pontos) FROM pessoas);

  Já esse não daria erro pois após o where é feito uma comparação e é utilizado a subquerry
*/
/*subquery-vem após os operadores condicionais*/
  SELECT primeiro_nome,camiseta_ou_chapeu,qte_pontos FROM pessoas WHERE qte_pontos >= (SELECT max(qte_pontos) FROM pessoas);
/*deixa as letras minusculas*/
  SELECT LOWER(primeiro_nome) FROM pessoas;
/*deixa as letras maiusculas*/
  SELECT UPPER(primeiro_nome) FROM pessoas;
/*remover numeros de caracteres e selecionar quantos vão aparecer*/
   SELECT upper(primeiro_nome),substr(primeiro_nome,1,4) FROM pessoas;
/*remover numeros de caracteres e selecionar quantos vão aparecer, o menos significa as ultimas posições ou seja -1 ultima posição -2 penultima e assim segue*/
 SELECT upper(primeiro_nome),substr(primeiro_nome,-5,2) FROM pessoas;
/*substituir um valor de caractere por outro ou por um espaço em branco*/
SELECT upper(primeiro_nome),replace(primeiro_nome,'a','x') FROM pessoas;
SELECT upper(primeiro_nome),replace(primeiro_nome,'J','xz') FROM pessoas;
SELECT upper(primeiro_nome),replace(primeiro_nome,'a','') FROM pessoas;